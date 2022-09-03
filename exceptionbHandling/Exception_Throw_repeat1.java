package exceptionbHandling;

public class Exception_Throw_repeat1 {

	public static void main(String[] args) {
		
		
		try {
			Exception e = new Exception("Exception is occured intentionally.");
			throw e;
		} catch (Exception e) {
			System.out.println("Error msg : " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Program is ended");
	}
	
	

}
