package com.fastcampus.ch4.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.fastcampus.ch4.dao.BoardDao;
import com.fastcampus.ch4.domain.BoardDto;
import com.fastcampus.ch4.domain.PageHandler;
import com.fastcampus.ch4.domain.SearchCondition;
import com.fastcampus.ch4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @PostMapping("/modify")
    public String modify(BoardDto boardDto, HttpServletRequest request, HttpSession session, Model m, RedirectAttributes rattr) {
        String writer = (String) session.getAttribute("id");
        boardDto.setWriter(writer);
        try {

            int rowCtn = boardService.modify(boardDto); // insert

            if (rowCtn != 1) {
                throw new Exception("Modify Fail");
            }

            rattr.addFlashAttribute("msg", "MDF_OK");

            return "redirect:/board/list";

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute(boardDto);
            rattr.addFlashAttribute("msg", "MDF_ERROR");

            return "board";
        }

    }


    @GetMapping("/write")
    public String write(Model m) {
        m.addAttribute("mode", "new");
        return "board"; // 읽기와 쓰기에 모두 사용하고 쓰기에 사용할 때에 "new"를 준다.
    }

    @PostMapping("/write")
    public String write(BoardDto boardDto, HttpServletRequest request, HttpSession session, Model m, RedirectAttributes rattr) {
        String writer = (String) session.getAttribute("id");
        boardDto.setWriter(writer);
        try {

            int rowCtn = boardService.write(boardDto); // insert

            if (rowCtn != 1) {
                throw new Exception("Write Fail");

            }

            rattr.addFlashAttribute("msg", "WRT_OK");

            return "redirect:/board/list";

        } catch (Exception e) {
            e.printStackTrace();
            m.addAttribute(boardDto);
            rattr.addFlashAttribute("msg", "WRT_ERROR");

            return "board";
        }

    }


    @GetMapping("/list")
    public String list(SearchCondition sc, Model m, HttpServletRequest request) {
        if (!loginCheck(request))
            return "redirect:/login/login?toURL=" + request.getRequestURL();  // 로그인을 안했으면 로그인 화면으로 이동

        try {

            int totalCnt = boardService.getSearchResultCnt(sc);
            m.addAttribute("totalCnt", totalCnt);

            PageHandler pageHandler = new PageHandler(totalCnt, sc);

            List<BoardDto> list = boardService.getSearchResultPage(sc);
            m.addAttribute("list", list);
            m.addAttribute("ph", pageHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "boardList"; // 로그인을 한 상태이면, 게시판 화면으로 이동
    }

    @GetMapping("/read")
    public String read(Integer bno, Integer page, Integer pageSize, Model m) throws Exception {

        try {

            BoardDto boardDto = boardService.read(bno);
            m.addAttribute(boardDto);
            m.addAttribute("page", page);
            m.addAttribute("pageSize", pageSize);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return "board";

    }

    @PostMapping("/remove")
    public String remove(Integer bno, Integer page, Integer pageSize, Model m, HttpSession session, RedirectAttributes rattr) {

        String writer = (String) session.getAttribute("id");

        try {

            // 이렇게 적어주면 굳이 뒤에 파라미터 값 안줘도 알아서 뒤에 가서 붙음
            m.addAttribute("page", page);
            m.addAttribute("pageSize", pageSize);

            int rowCnt = boardService.remove(bno, writer);
            System.out.println("삭제가 되는지 확인하기 =" + boardService.remove(bno, writer));

            if (rowCnt != 1) {
                throw new Exception("board remove error");
            }

            // m.addAttribute("msg", "delete success");
            rattr.addFlashAttribute("msg", "delete success");

        } catch (Exception e) {
            e.printStackTrace();
            //m.addAttribute("msg", "delete ERROR");
            rattr.addFlashAttribute("msg", "delete ERROR");
        }

        return "redirect:/board/list";

    }


    private boolean loginCheck(HttpServletRequest request) {
        // 1. 세션을 얻어서
        HttpSession session = request.getSession();
        // 2. 세션에 id가 있는지 확인, 있으면 true를 반환
        return session.getAttribute("id") != null;
    }
}