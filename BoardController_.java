//package com.fastcampus.ch4.controller;
//
//import com.fastcampus.ch4.domain.*;
//import com.fastcampus.ch4.service.*;
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.stereotype.*;
//import org.springframework.ui.*;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.*;
//
//import javax.servlet.http.*;
//import java.time.*;
//import java.util.*;
//
//@Controller
//@RequestMapping("/board")
//public class BoardController_ {
//    @Autowired
//    BoardService boardService;
//
//    @GetMapping("/list")
//    public String list(Integer page, Integer pageSize, Model m, HttpServletRequest request) throws Exception{
//        if(!loginCheck(request))
//            return "redirect:/login/login?toURL="+request.getRequestURL();  // 로그인을 안했으면 로그인 화면으로 이동
//
//        // board  게시판에 들어가면 게시글들 띄워줘야 하므로 service를 이용
//
//        if(page==null) page=1;
//        if(pageSize==null) pageSize = 3;
//
//        int totalCnt = boardService.getCount();
//
//        Map map = new HashMap();
//        map.put("offset", (page-1)*pageSize);
//        map.put("pageSize", pageSize);
//
//        List<BoardDto> list = boardService.getPage(map);
//
//        PageHandler ph = new PageHandler(totalCnt, pageSize, page);
//
//        m.addAttribute("ph", ph);
//        m.addAttribute("list", list);
//
//
//        return "rBoardList"; // 로그인을 한 상태이면, 게시판 화면으로 이동
//    }
//
//    private boolean loginCheck(HttpServletRequest request) {
//        // 1. 세션을 얻어서
//        HttpSession session = request.getSession();
//        // 2. 세션에 id가 있는지 확인, 있으면 true를 반환
//        return session.getAttribute("id")!=null;
//    }
//}