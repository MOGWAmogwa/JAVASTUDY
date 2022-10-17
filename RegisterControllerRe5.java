//package com.Fastcampus.app;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class RegisterControllerRe5 {
//
//	@RequestMapping("/register/add")
//	public String register() {
//		return "registerForm";
//	}
//	
//	
//	@RequestMapping("/register/save")
//	public String save(User user, Model model) throws UnsupportedEncodingException {
//		
//		if(!isValid(user)) {
//			
//			String msg = URLEncoder.encode("invalid id", "utf-8");
//			
//			model.addAttribute("msg", msg);
//			return "redirect:/register/add";
//			
////			return "redirect:/register/add?msg="+msg;
//			
//		}
//		
//		return "registerInfo";
//	}
//
//
//	private boolean isValid(User user) {
//		return false;
//	}
//}
