//package com.Fastcampus.app;
//
//import java.util.Calendar;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
////http://localhost:8080/app/getyoilMVC2?year=2022&month=10&day=12
//
//@Controller
//public class YoilTellerMVC2_repeat1 {
//	
//	@ExceptionHandler(Exception.class)
//	public String catcher(Exception ex) {
//		ex.printStackTrace();
//		return "yoilError";
//	}
//	
//	@RequestMapping("/getYoilMVC2")
//	public static String main(@ModelAttribute MyDate date) {
//
//		
//		if(!isValid(date)) {
//			return "yoilError";
//		}
//
//		return "yoil";
//		
//	} 
//
//	private static @ModelAttribute("yoil") char getYoil(MyDate date) {
//		return getYoil(date.getYear(), date.getMonth(), date.getDay());
//	}
//
//	
//	private static char getYoil(int year, int month, int day) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month-1, day);
//		
//		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		return " 일월화수목금토".charAt(dayOfWeek);
//	}
//
//	private static boolean isValid(MyDate date) {
//		return isValid(date.getYear(), date.getMonth(), date.getDay());
//	}
//
//	private static boolean isValid(int year, int month, int day) {
//		if(year==-1 || month==-1 || day==-1) 
//    		return false;
//    	
//    	return (1<=month && month<=12) && (1<=day && day<=31); // 간단히 체크 
//	}
//
//}
