package jungsuk_coding;

public class Practice4_13 {

	public static void main(String[] args) {
		

		// 다음은 주어진 문자열(value) 를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 코드를 완성하시오. 
		
		String value = "1234";
		
		char ch = ' ';
		
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다. 
		
		///// --- 내가 원하는 것 - 문자 a를 읽는 순간 isNumber를 false값을 저장하고 반복문을 탈출? 하고 싶음 ---  ////// count 안쓰고 break 쓰면되네
		

		for(int i= 0 ; i < value.length(); i++) {
			if( value.charAt(i) >= '0' && value.charAt(i) <='9') {
				isNumber = true;
			}  else {
				isNumber = false;
				break;
			}
	
			
		}
		
		// 하나라도 false가 나오면 false가 리턴될 수 있도록 해야하는데 어케하지
		// 아니 더 디테일하게 말하면 a가 false가 됐을 때 isNumber 가 false가 된 상태로 값이 저장되고 끝나야함 뒤에를 읽을 필요가 없음 
		// 횟수를 세볼까 string의 길이와 count 다르다면 숫자가 아닌거지 
		// 문자인 o를 숫자로 바꿔보겠음
		
//		System.out.println("/////////////");
//		System.out.println(value.charAt(2)+0); // 111 숫자랑 연산하면 111이 나옴 
		
		// 그러면 저기 위에 있는 글자를 하나씩 읽어서 숫자면 그 숫자가 포함되는 유니코드 영역이 있을거고 문자면 그 문자가 해당되는 유니코드 범위를 설정해주기 
		// 내가 알기로 48~57 사이면 0~9 임 97~122 & 65~90 사이면 알파벳임
		
		
		
		
		if(isNumber) {
			System.out.println(value + " is number. ");
		}else {
			System.out.println(value + " is not number. ");
		}
	}

}
