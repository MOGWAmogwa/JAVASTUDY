package com.fastcampus.ch2;

import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTellerMVC { 
	@RequestMapping("/yoilMVC")
	public String main(int year, int month, int day , Model model) {

		
		// url :  http://localhost:8080/ch2/yoilMVC?year=2022&month=10&day=10
		
		
		// 1. 유효성 검사 
		
		if(!isValid(year,month,day)) {
			return "yoilError";
		}
		
		// 2. 처리 
		
		String yoil = getYoil(year, month, day);
		
		
		// 3. Model에 작업 결과 저장 
		
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		
		// 4. 작업 결과를 보여줄 view의 이름을 반환
		
		return "yoil";

	}

	private boolean isValid(int year, int month, int day) {
		// TODO Auto-generated method stub
		return true;
	}

	private String getYoil(int year, int month, int day) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] yoils = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		String yoil= yoils[dayOfWeek];
		
		
		return yoil ; 
		
		 
		
	}

}
