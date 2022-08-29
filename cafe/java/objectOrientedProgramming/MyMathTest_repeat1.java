package cafe.java.objectOrientedProgramming;

public class MyMathTest_repeat1 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(2L, 5L);
		long result2 = mm.subtract(5L, 2L);
		long result3 = mm.multiply(2L, 5L);
		double result4 = mm.divide(6L, 3L);
		
		System.out.println("add :" + result1);
		System.out.println("subtract :" + result2);
		System.out.println("multiply :" + result3);
		System.out.println("divide :" + result4);
		
		
	
	}

}

class MyMath{
	long add(long a , long b ) {
		return a+b;
	}
	long subtract(long a , long b ) {
		return a-b;
	}
	long multiply(long a , long b ) {
		return a*b;
	}
	double  divide(double a , double b ) {
		return a+/b;
	}
}
