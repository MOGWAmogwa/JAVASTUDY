//package com.fastcampus.ch2;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class TwoDice_repeat1 {
//	@RequestMapping("/rollDice")
//	public static void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		int r = (int)(Math.random()*6)+1;
//		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<img src=\"/resources/img/dice" + r + ".jpg>");
//		out.println("</body>");
//		out.println("</html>");
//		
//		
//		
//		
//
//	}
//
//}
