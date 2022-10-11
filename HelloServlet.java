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
		// 1. ������ �ʱ�ȭ �� �� �ڵ� ȣ���Ǵ� �޼��� /  ������ �ʱ�ȭ �۾� ���
		System.out.println("[HelloServlet] init()");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. �Է�
		// 2. ó��
		// 3. ���
		System.out.println("[HelloServlet] service()");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// ������ - ������ �޸𸮿��� ���ŵ� �� ���� �����̳ʿ� ���ؼ� �ڵ� ȣ��
		System.out.println("[HelloServlet] destroy()");
		super.destroy();
	}


}
