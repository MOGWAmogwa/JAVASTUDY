package exceptionbHandling;

public class ExceptionTest_repeat5 {

	public static void main(String[] args) {
		int number = 100 ; 
		int result = 0 ; 
		
		for (int i = 0 ; i < 10 ; i++) {
			try {
				result = 100 / (int)(Math.random()*10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0");
			}
		}

	}

}
