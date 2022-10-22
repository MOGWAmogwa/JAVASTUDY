package com.fastcampus.ch2;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		// 세션에 있던 id 정보를 지워주기
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}

	@PostMapping("/login")
	public String login( String id, String pwd, String toURL, HttpServletRequest request) throws UnsupportedEncodingException {
		// @CookieValue("JSESSIONID") String sessionId
		// id & pwd를 체크, 유효하지 않은 id라면 다시 로그인 화면으로 돌아가게 만든다.
		if(!loginCheck(id, pwd)) {
			//String msg = URLEncoder.encode("invalid id", "utf-8");

			return "redirect:/login/login";
		}
		
		// id & pwd가 유효하다면 session에 저장한다. 
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		
		// 저장 후 home 화면으로 이동시킨다. 
		
		toURL = toURL== null || toURL.equals("") ? "/" : toURL ;
		
		return "redirect:"+toURL;
	}

	private boolean loginCheck(String id, String pwd) {

		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
