package com.Fastcampus.app;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
//	@RequestMapping(value = "/register/save", method = {RequestMethod.GET, RequestMethod.POST })
//	@RequestMapping("/register/add", method="RequestMethod.GET") // �ű�ȸ�� ���� ȭ�� 
	
//	@GetMapping("/register/add")
//	public String register() {
//		return "registerForm";
//	}
	
// 	POST  ������θ� ȸ�������� �����ϵ��� �ٲٱ� , GET ������� ȸ������ �Ǵ� ���� ����
//	@RequestMapping(value = "/register/save", method = RequestMethod.POST)
	
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception {
		
		// 1. ��ȿ�� �˻� 
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id �� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			
			m.addAttribute("msg", msg);
			return "redirect:/register/add";
//			return "redirect:/register/add?msg="+msg; //URL ���ۼ�(Rewriting)
		}
		
		// 2. DB�� �ű�ȸ�� ������ ����
		
		return "registerInfo";
	}

private boolean isValid(User user) {

	return true;
}
	
}
