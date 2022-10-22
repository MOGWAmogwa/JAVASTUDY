package com.fastcampus.ch2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/list")
	public String list(HttpServletRequest request) throws UnsupportedEncodingException {
		
		// board 를 클릭했을 때 바로 게시판으로 이동해서는 안되고, loginCheck()를 통해서 로그인이 되어있다면 boardList.jsp를 보여준다.
		// 로그인이 안되어 있으면 다시 /login/login 으로 redirect 한다 
		
		if(!loginCheck(request)) {
			String msg = URLEncoder.encode("게시판은 로그인을 해야 이용할 수 있습니다.", "utf-8");
			return "redirect:/login/login?toURL="+request.getRequestURL();
		}
		
		return "boardList";
	}

	private boolean loginCheck(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		return session.getAttribute("id") != null;
	}

}
