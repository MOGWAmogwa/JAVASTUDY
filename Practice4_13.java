package jungsuk_coding;

public class Practice4_13 {

	public static void main(String[] args) {
		

		// 다음은 주어진 문자열(value) 를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 코드를 완성하시오. 
		
		String value = "12o34";
		
		char ch = ' ';
		
		//boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다. 
		
		for(int i= 0 ; i < value.length(); i++) {
			System.out.println(value.charAt(i)); // 하나씩 그냥 출력을 해보겠음
		}
		
		// 문자인 o를 숫자로 바꿔보겠음
		
		System.out.println("/////////////");
		System.out.println(value.charAt(2)); // 111 숫자랑 연산하면 111이 나옴 
		
		
//		if(isNumber) {
//			System.out.println(value + "는 숫자입니다. ");
//		}else {
//			System.out.println(value + "는 숫자가 아닙니다. ");
//		}
	}

}
