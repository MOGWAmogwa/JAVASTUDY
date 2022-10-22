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
		
		// board �� Ŭ������ �� �ٷ� �Խ������� �̵��ؼ��� �ȵǰ�, loginCheck()�� ���ؼ� �α����� �Ǿ��ִٸ� boardList.jsp�� �����ش�.
		// �α����� �ȵǾ� ������ �ٽ� /login/login ���� redirect �Ѵ� 
		
		if(!loginCheck(request)) {
			String msg = URLEncoder.encode("�Խ����� �α����� �ؾ� �̿��� �� �ֽ��ϴ�.", "utf-8");
			return "redirect:/login/login?toURL="+request.getRequestURL();
		}
		
		return "boardList";
	}

	private boolean loginCheck(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		return session.getAttribute("id") != null;
	}

}
