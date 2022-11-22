package jungsuk_coding;

public class Practice4_12 {

	public static void main(String[] args) {
		// 구구단의 일부분을 다음과 같이 출력하시오 
		
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1; j <=3; j++) {
				System.out.printf("  %d * %d = %d  " , i , j , i*j);
				System.out.println();
			}
			
		System.out.println();
			
		}
	
	}

}
