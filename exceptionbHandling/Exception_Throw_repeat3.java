package exceptionbHandling;

public class Exception_Throw_repeat3 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("Exception is occured intentionally.");
			throw e;
		} catch (Exception e) {
			System.out.println("Error message : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Program is ended");

	}

}
