package exceptionbHandling;

public class Exception_Re_Throwing_repeat4 {

	public static void main(String[] args) {
		try { 
			method1 ();
			
		}catch (Exception e) {
			System.out.println("main method proceeded Exception.");
		}

	}
	
	static void method1() throws Exception{
		try {
			throw new Exception();
			
		}catch (Exception e) {
			System.out.println("method 1 proceeded Exception .");
			throw e;
		}
	}

}
