//package com.fastcampus.ch2;
//
//import java.util.Calendar;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//@Controller
//public class YoilTellerMVC_repeat1 {
//	@RequestMapping("/yoilTellerMVC")
//	public String main(int year, int month, int day, Model model, HttpServletResponse response) {
//
//		
//		// 1. ��ȿ�� �˻� 
//		
//		if(!isValid()) {
//			return "yoilError";
//		}
//		
//		// 2. ó�� 
//		
//		char yoil = getYoil(year, month, day);
//		
//		// 3. �𵨿� ��� �� ����
//		
//		model.addAttribute("year", year);
//		model.addAttribute("month", month);
//		model.addAttribute("day", day);
//		model.addAttribute("yoil", yoil);
//		
//		return "yoil";
//		
//		
//	}
//
//	private static char getYoil(int year, int month, int day) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month, day);
//		
//		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		return " �Ͽ�ȭ�������".charAt(dayOfWeek);
//	}
//	
//	
//
//	private static boolean isValid() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
