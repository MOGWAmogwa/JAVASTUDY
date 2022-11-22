package jungsuk_coding;

public class Practice4_10 {

	public static void main(String[] args) { 
		
		
		// 문자열로 변환하지 않고 숫자로만 처리해서 sum 하기  
		
		int num = 12345; // 1 x 10000 , 2 x 1000 , 3 x 100 ,  4 x 10 , 5 x 1 로 이루어져있음..몫을 구한다음에 걔를 10, 100, 1000 자릿수로 나눠주면 되지 않을까..? 라고 생각해본다
		
		
		int sum = 0 ; 
		
		// 2차 시도 12시까지 안풀리면 그냥 넘어갈거임 지금 11시 27분 
		
		// 몫을 구해야 하는데 그냥 나눠버리면 indexout바운드 어쩌고 에러가 남 ㅠ
//		
		
	 // 12 : 02 풀었당!
		
		for(int i = 1 ; i < num ; i = i * 10) {
			
			 sum = sum + (num % (i*10) - (num % i) ) / i;
			
		}
		
		System.out.println(sum);

//		System.out.println( (12345%10-(12345%1))/1  );
//		System.out.println( (12345%100-(12345%10))/10  );
//		System.out.println( (12345%1000-(12345%100))/100  );
//		System.out.println( (12345%10000-(12345%1000))/1000  );
//		System.out.println( (12345%100000-(12345%10000))/10000  );
	
//		int result = 0 ; 
//
//		for(int i = 1 ; i < num ; i = i * 10) {
//			  result = num - (num % i);
//
//			   for (int j = 1 ; j < num ; j = j * 10) { // 얘는 왜 했냐면 
//				   sum = result % j; 
//					System.out.println(sum);
//			   }
//			  
//			
//			  
////			 System.out.println(result % 10 );
////			 
////			 5
////			 0
////			 0
////			 0
////			 0
//			  
////			  System.out.println(result % 100 );
////			  
////			  
////			  45
////			  40
////			  0
////			  0
////			  0
//
//
//		
//
//			
//		}
		
		
		

		
//		12345
//		12340 위에서 아래거 빼면 5
//		12300 위에서 아래거 빼면 40 
//		12000 위에서 아래거 빼면 300
//		10000 위에서 아래거 빼면 2000
		
		
		
		// 1 차시도 
		
//		for(int i = 10000 ; i < num ; i = i / 10) {
//			int result = num - (num % i);
//			System.out.println(result);
//		}
		
//		10000
//		12000
//		12300
//		12340
//		12345  연산결과가 이렇게 나오는데 얘를 아래에서 위로 빼주면 음..1의 자리수 10의 자리수 100의 자리수가 나오는 것처럼 보임 얘를 근데 또 나눠줘야 하는데 미궁속으로 빠져드는 느낌 이건 아닌 것 같다
	
		
//		int count = 0 ; // 카운트 변수를 하나 만들어서 저기 밑에보면 result값이 다섯개 나오잖수 그것 만큼 반복문 돌릴거임 
//		for(int i = 1 ; i < num ; i = i * 10) {
//			int result = num - (num % i); // 이건 뭔 소리냐면 12345 - (12345 % 1 이거 결과 0) = 12345 , 12345 - (12345 % 10 이거 결과 5) = 12340 ... 이렇게 나옴 
//			count++; 
//			System.out.println(result);
//			for(int j = 0 ; j < count ; j++) {
//				
//			}
//			
//		
//	}
		
//		12345
//		12340
//		12300
//		12000
//		10000 곱하기로 바꿔주면 연산결과가 뒤집어서 나옴~~ 
		

		
		
	
		
		
		
		

	}

}
