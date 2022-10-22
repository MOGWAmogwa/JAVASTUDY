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
		// ���ǿ� �ִ� id ������ �����ֱ�
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}

	@PostMapping("/login")
	public String login( String id, String pwd, String toURL, HttpServletRequest request) throws UnsupportedEncodingException {
		// @CookieValue("JSESSIONID") String sessionId
		// id & pwd�� üũ, ��ȿ���� ���� id��� �ٽ� �α��� ȭ������ ���ư��� �����.
		if(!loginCheck(id, pwd)) {
			//String msg = URLEncoder.encode("invalid id", "utf-8");

			return "redirect:/login/login";
		}
		
		// id & pwd�� ��ȿ�ϴٸ� session�� �����Ѵ�. 
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		
		// ���� �� home ȭ������ �̵���Ų��. 
		
		toURL = toURL== null || toURL.equals("") ? "/" : toURL ;
		
		return "redirect:"+toURL;
	}

	private boolean loginCheck(String id, String pwd) {

		return "asdf".equals(id) && "1234".equals(pwd);
	}
}
