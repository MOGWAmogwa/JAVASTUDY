package exceptionbHandling;



public class Exception_Re_Throwing_repeat5 {

	public static void main(String[] args) {
		
		try {
			method1();

		}catch(Exception e) {
			System.out.println("main method is proceed.");
		}

	}
	
	static void method1 () throws Exception {
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println("method1 is proceeded.");
			throw e;
		}
	}

}

