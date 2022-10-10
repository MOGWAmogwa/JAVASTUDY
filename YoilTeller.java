package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class YoilTeller {
	@RequestMapping("/Yoil")
	public static void main(HttpServletRequest request , HttpServletResponse response ) throws IOException {
		// TODO Auto-generated method stub

		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(yyyy, mm-1, dd);
		
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] yoils = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		String yoil = yoils[dayOfWeek];
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.println(year + " . " + month + " . " + day );
		out.println(yoil);
		
		

		
		
		
	}

}
