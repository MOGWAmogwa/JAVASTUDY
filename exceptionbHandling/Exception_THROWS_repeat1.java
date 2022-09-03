package exceptionbHandling;

public class Exception_THROWS_repeat1 {

	public static void main(String[] args) throws Exception {
		method1();

	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

}


// Exception 은 사용자 실수로 생긴 예외, 필수처리, checked 처리 
// RuntimeException 은 프로그래머 실수로 생긴 예외, 선택 처리, unchecked 처리 
