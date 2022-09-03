package exceptionbHandling;

public class Exception_Throw_repeat4 {

	public static void main(String[] args) {


		try {
			Exception e = new Exception("I generate exception intentianally.");
			throw e;
			
		}catch(Exception e) {
			System.out.println("Error message : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program is ended");
	}

}
