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
//	@RequestMapping("/register/add", method="RequestMethod.GET") // �ű�ȸ�� ���� ȭ�� 
	
//	@GetMapping("/register/add")https://nid.naver.com/nidlogin.logout?returl=https%3A%2F%2Fwww.naver.com
	public String register() {
		return "registerForm";
	}
	
// 	POST  ������θ� ȸ�������� �����ϵ��� �ٲٱ� , GET ������� ȸ������ �Ǵ� ���� ����
//	@RequestMapping(value = "/register/save", method = RequestMethod.POST)
	
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception {
		
		// 1. ��ȿ�� �˻� 
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id �� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			
			m.addAttribute("msg", msg);
			return "forward:/register/add";
//			return "redirect:/register/add?msg="+msg; //URL ���ۼ�(Rewriting)
		}
		
		// 2. DB�� �ű�ȸ�� ������ ����
		
		return "registerInfo";
	}

private boolean isValid(User user) {

	return false;
}
	
}
