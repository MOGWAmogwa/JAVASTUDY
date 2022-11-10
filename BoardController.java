package com.fastcampus.ch4.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.fastcampus.ch4.domain.BoardDto;
import com.fastcampus.ch4.domain.PageHandler;
import com.fastcampus.ch4.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public String list(Integer page, Integer pageSize, Model m, HttpServletRequest request) {
        if(!loginCheck(request))
            return "redirect:/login/login?toURL="+request.getRequestURL();  // 로그인을 안했으면 로그인 화면으로 이동

        if(page == null) page = 1;
        if(pageSize == null) pageSize = 3;

        try {
            int totalCnt = boardService.getCount(); // 50개
            PageHandler pageHandler = new PageHandler(totalCnt, pageSize, page);

            Map map = new HashMap();
            map.put("offset", (page-1)*pageSize);
            map.put("pageSize", pageSize);

            List<BoardDto> list =  boardService.getPage(map);
            m.addAttribute("list", list);
            m.addAttribute("ph", pageHandler);
            m.addAttribute("page", page);
            m.addAttribute("pageSize" + pageSize);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "boardList"; // 로그인을 한 상태이면, 게시판 화면으로 이동
    }

    @GetMapping("/read")
    public String read(Integer bno, Integer page, Integer pageSize, Model m) throws Exception{

        try {

            BoardDto boardDto = boardService.read(bno);
            m.addAttribute(boardDto);
            m.addAttribute("page", page);
            m.addAttribute("pageSize" , pageSize);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "board";

    }

    @GetMapping("/remove")
    public String redirectListPage(Integer bno, String writer, Integer page, Integer pageSize, Model m){
        return "redirect:/board/list?page=" + page.intValue() + "&pageSize=" + pageSize.intValue() ;
    }

    @PostMapping("/remove")
    public void remove(Integer bno, String writer, Integer page, Integer pageSize, Model m) throws Exception{

        System.out.println("page = " + page);
    }

    private boolean loginCheck(HttpServletRequest request) {
        // 1. 세션을 얻어서
        HttpSession session = request.getSession();
        // 2. 세션에 id가 있는지 확인, 있으면 true를 반환
        return session.getAttribute("id")!=null;
    }
}