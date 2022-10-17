//package com.Fastcampus.app;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/login")
//public class LoginControllerRe2 {
//	@RequestMapping("/login")
//	public String login(String id , String pwd , boolean rememberId, HttpServletResponse response) throws UnsupportedEncodingException {
//		
//		
//		if(!loginCheck(id, pwd)) {
//			String msg = URLEncoder.encode("id & pwd is not valid.", "utf-8");
//			
//			return "redirect:/login/login?msg="+msg;
//		}
//		
//		if(rememberId) {
//			Cookie cookie = new Cookie("id", id);
//			response.addCookie(cookie);
//			
//		}else {
//			Cookie cookie = new Cookie("id", id);
//			cookie.setMaxAge(0); // cookie ªË¡¶ 
//			response.addCookie(cookie);
//		}
//		
//		return "redirect:/";
//	}
//
//	private boolean loginCheck(String id, String pwd) {
//		// TODO Auto-generated method stub
//		return "asdf".equals(id) && "1234".equals(pwd);
//	}
//}
