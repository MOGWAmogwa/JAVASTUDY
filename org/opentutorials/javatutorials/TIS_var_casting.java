package TIS_JAVA_STUDY;

public class TIS_var_casting {
	
	// 자바의 정석 ch2 변수 13페이지

	public static void main(String[] args) {
		int i = 300;
		byte j = (byte)i;
		
		System.out.println(j);
		
		// 강제 형변환 시에는 bit 값의 손실이 발생 
		
		double d = 3.14;
		
		int k = (int)d;
		
		System.out.println(k);
		
	
		// 작은 타입에서 큰 타입으로 바꾸는거라 값손실 없음. 생략 가능
		
		int l = 3;
		
		double e = l;
		
		System.out.println(e);
		
		
		// ------------------------- //
		
		byte w = 65; 
		
		char q = (char)w;
		
		System.out.println(q);
		
		
		// 형변환 연산
		
		int x = 30;
		double y = 30.2;
		
		int z =  (int)(x+y);
		
		/*byte+byte 의 연산
		 * 
		 * 연산시 int 보다 작은 정수타입은 모두 int 형으로 바뀐다. 
		 * 형의 승격이라고 부르기도 한다. 
		 * 
		 * */
			
		
		byte b1 = 10;
		byte b2 = 20;
//		byte result = (byte)(b1+b2);
		int result = b1+b2;

		
		// byte + byte => int + int
		// char + byte => int + int
		// byte + short => int + int
		
		
		
		/*
		 * 타입이 다른 두 데이터 간의 연산 시 큰 타입을 따라간다. 
		 * 
		 * int+long = long+long
		 * int + float = float + float
		 * float + double = double +double
		 * 
		 * */
		
		int x1 = 50; 
		int y1 = 10 ; 
		double z1 = y1%x1;
		System.out.println(z1);
		
		int x2 = 3; 
		int y2 = 5;
		double z2 = (double)x2 / y2 ; // 처음에는   int 형 간의 연산이기 때문에 0이 나와버림. 원하는 결과가 아님 
		System.out.println(z2);
		
		
		String str = "java";
		
		double ver = 1.8;
		
		System.out.println(str + ver); // 타입은  String
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}

