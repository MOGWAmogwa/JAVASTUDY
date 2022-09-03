package exceptionbHandling;

public class ExceptionTest_repeat2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0 ; 
		
		
		for (int i = 0 ; i < 10; i++) {
			try {
				result = number / (int)(Math.random()*10); // Math.randoc()*10 은 0 부터 10 까지의 숫자를 의미한다. 
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0, you can't divide by zero."); // 값을 0으로 나눌 수 없다. 그래서 오류 발생 catch를 잡아서 0 
			} // try-catch 끝
		}

	}

}
