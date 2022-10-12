//package com.Fastcampus.app;
//
//import java.util.Calendar;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class YoilTellerMVC2_repeat2 {
//	@RequestMapping("/getYoilMVC2")
//	public String main(@ModelAttribute MyDate date) {
//		
////		@ExceptionHandler(Exception.class)
////		public String catcher(Exception ex) {
////			ex.printStackTrace();
////			return "yoilError";
////		}
//		
//		if(!isValid(date)) {
//			return "yoilError";
//		}
//		
//		char yoil = getYoil(date);
//		
//		return "yoil";
//		
//		
//	}
//
//	private char getYoil(MyDate date) {
//		return getYoil(date.getYear() , date.getMonth(), date.getDay());
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
//	private boolean isValid(MyDate date) {
//		return isValid(date.getYear() , date.getMonth(), date.getDay());
//	}
//
//	private boolean isValid(int year, int month, int day) {
//		if(year==-1 || month == -1 || day ==-1) {
//			return false;
//		}
//		
//		return (month < 12 || month > 0) && (day > 0 || day <= 31 );
//	}
//}
