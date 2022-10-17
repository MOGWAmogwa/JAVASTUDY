package com.Fastcampus.app;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	@RequestMapping(value = "/register/add", method = {RequestMethod.GET, RequestMethod.POST })
//	@RequestMapping("/register/add", method="RequestMethod.GET") // 신규회원 가입 화면 
	
//	@GetMapping("/register/add")https://nid.naver.com/nidlogin.logout?returl=https%3A%2F%2Fwww.naver.com
	public String register() {
		return "registerForm";
	}
	
// 	POST  방식으로만 회원가입이 가능하도록 바꾸기 , GET 방식으로 회원가입 되는 것을 방지
//	@RequestMapping(value = "/register/save", method = RequestMethod.POST)
	
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception {
		
		// 1. 유효성 검사 
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id 를 잘못 입력하셨습니다.", "utf-8");
			
			
			m.addAttribute("msg", msg);
			return "forward:/register/add";
//			return "redirect:/register/add?msg="+msg; //URL 재작성(Rewriting)
		}
		
		// 2. DB에 신규회원 정보를 저장
		
		return "registerInfo";
	}

private boolean isValid(User user) {

	return false;
}
	
}
