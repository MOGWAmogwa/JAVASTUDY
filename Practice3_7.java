package jungsuk_coding;

public class Practice3_7 {
		public static void main(String[] args) {
			int fahrenheit = 100;
			//float celcius = 5/9; // 0.0 왜 에러가 안뜨고 0.0 이 뜰까? float 타입 변수에 5/9 는 d가 생략돈 상태라 double이라 에러가 나야 하는 것 아닌가?
			// 예를 들면 long l = 100; 은 알아서 형변환 되지만 long l = 10_000_000_000; 이렇게 L생략하면 에러가 나는 것처럼 에러가 나야되는거 아닌감..?
			
			//float celcius = (float)(((int)((float)5/9 *(fahrenheit - 32)*100)+1) / 100.0 ); // ?
			float celcius = (float)(((int)((float)5/9 *(fahrenheit - 32)*100)+1) / 100.0 );
			// float celTest = celcius * 100; // 3777.7778 나오는데 뒤에 0.7778 값을 날릴거임 // 안날려도됨 착각쓰;
		
			
			//int test = (int)(celcius * 100)+1; // 3778
			
			//float test2 = (float)(test / 100.0);
			
			//System.out.println(test2);
			
			
		
			System.out.println(" fahrenheit : " +fahrenheit);
			System.out.println(" celcius : " + celcius);
			
	

					
		}
}
