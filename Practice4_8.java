package jungsuk_coding;

public class Practice4_8 {
 
	
	public static void main(String[] args) {
		
		// 방정식 2x+4y = 10 의 모든 해를 구하시오 
		
		for(int i = 0 ; i <= 10 ; i++) {
			
			for(int j = 0 ; j <=10 ; j++) {
				if(2*i + 4*j == 10) {
					System.out.printf(" x = %d , y = %d " , i, j );
					
				}
			}
			
			System.out.println();
		}
		
	}
	
	
	
}
