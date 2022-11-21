package jungsuk_coding;

public class Practice3_10 {

	public static void main(String[] args) {
		
		// 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch 에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 문자콛느느 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A' 의 코드는 65이고, 'a'의 코드는 97이다. 
		char ch = 'B';
		char lowerCase = ch+0 < 97 ? (char)(ch+32) : ch ;
		
		System.out.println("ch :" + ch);
		//System.out.println(ch + 0);
		//System.out.println((char)(ch+0-32));
		System.out.println("ch to lowerCse :" + lowerCase);
		
		

	}

}
