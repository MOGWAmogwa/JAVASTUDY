//package com.Fastcampus.app;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class RegisterControllerRe2 {
//
////	@RequestMapping("/regeister/add")
//	@GetMapping("/regeister/add")
//	public String register() {
//		return "registerFrom";
//	}
//	
////	@RequestMapping("/register/save")
//	@PostMapping("/register/save") // post ������θ� ȸ�������� �ǵ��� ����� get ������� ȸ�������� �Ǵ� ���� ���� 
//	public String save(User user ,  Model model) throws UnsupportedEncodingException {
//		
//		if(!isValid(user)) {
//			String msg = URLEncoder.encode("you type wrong id", "utf-8");
//
//			model.addAttribute("msg", msg);
//			return "redirect:/register/add";
////			return "redirect:/register/add?msg=" + msg;
//
//		}
//		
//		return "registerInfo";
//	}
//
//	private boolean isValid(User user) {
//
//		return false;
//	}
//}
