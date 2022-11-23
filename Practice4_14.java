package jungsuk_coding;
import java.util.*;

public class Practice4_14 {

	public static void main(String[] args) {

		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다. 
		
		int answer = (int)(Math.random()*100)+1; // 답
		int input = 0 ; // 사용자 입력을 저장할 공간
		int count = 0 ; // 시도횟수를 세기위한 변수
		
		
		// 화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용 
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			count++;
			System.out.println("input number between 1 and 100 >>");
			input = sc.nextInt();
			
		// answer 보다 작은경우 25 > 10 -> 더 큰 값을 입력하세요  answer > input
			
			
				if(answer == input) {
					System.out.println("Correct!");
					System.out.println("you tried " + count + ".");
					break;
					
				} else if (answer < input) { // input 값이 더 큼
					System.out.println("you'd better input more small number.");
					
				} else {
					System.out.println("you'd better input more bigger number.");
				}
				
			
		
		
				
		// answer 보다 큰 경우  25 < 30 -> 더 작은 값을 입력하세요  answer < input
		// answer == input 
			
			
			
		}while(true); // 무한반복문
		

		
		
		
		
	}

}
