package cafe.java.objectOrientedProgramming;

public class MyMathTest_repeat2 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 2L);
		long result2 = mm.subtract(5L, 2L);
		long result3 = mm.multiply(5L, 2L);
		long result4 = mm.max(5L, 2L);
		double result5 = mm.divide(5L, 3L);
		
		System.out.println(result1);
		
		System.out.println(result2);
		
		System.out.println(result3);
		
		System.out.println(result4);
		
		System.out.println(result5);
		
		

	}

}


class MyMath{
	
	long add(long a , long b) {
		return a+b;
	}
	long subtract(long a , long b) {
		return a-b;
	}
	long multiply(long a , long b) {
		return a*b;
	}
	long max(long a , long b) {
		return a>b?a:b;
	}
	double divide(double a , double b) {
		return a/b;
	}
}