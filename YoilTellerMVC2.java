//package com.Fastcampus.app;
//
//import java.util.Calendar;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//// http://localhost:8080/app/getYoilMVC?year=2022&month=10&day=12
//
//@Controller
//public class YoilTellerMVC2 {
//	
//	@ExceptionHandler(Exception.class)
//	public String catcher(Exception ex) {
//		ex.printStackTrace();
//		return "yoilError";
//	}
//	@RequestMapping("/getYoilMVC2")
//	public String main(@RequestParam(required=true) int year, 
//			@RequestParam(required=true) int month, 
//			@RequestParam(required=true) int day, Model model) {
//		
//		// 1. 유효성 검사 
//		
//		if(!isValid()) {
//			return "yoilError";
//		}
//		
//		// 2. 처리
//		
//		char yoil = getYoil(year, month, day);
//		
//		// 3. model 
//		
//		model.addAttribute("year", year);
//		model.addAttribute("month", month);
//		model.addAttribute("day", day);
//		model.addAttribute("yoil", yoil);
//		
//		return "yoil";
//		
//		
//
//	}
//
//	private char getYoil(int year, int month, int day) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month, day);
//		
//		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		return " 일월화수목금토".charAt(dayOfWeek);
//	}
//
//	private static boolean isValid() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
