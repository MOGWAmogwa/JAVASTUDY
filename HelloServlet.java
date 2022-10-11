package com.Fastcampus.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		// 1. 서블릿이 초기화 될 때 자동 호츨되는 메서드 /  서블릿의 초기화 작업 담당
		System.out.println("[HelloServlet] init()");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 입력
		// 2. 처리
		// 3. 출력
		System.out.println("[HelloServlet] service()");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// 뒷정리 - 서블릿이 메모리에서 제거될 때 서블릿 컨테이너에 의해서 자동 호출
		System.out.println("[HelloServlet] destroy()");
		super.destroy();
	}


}
