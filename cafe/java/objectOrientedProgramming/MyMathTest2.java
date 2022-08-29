package cafe.java.objectOrientedProgramming;


class MyMath2 {
	long a, b;
	
	long add() {return a+b ;} 
	long subtract() {return a-b ;} 
	long multiply() {return a*b ;} 
	double divide() {return a/b ;} 
	
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}
public class MyMathTest2 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(10L, 5L));
		System.out.println(MyMath2.subtract(10L, 5L));
		System.out.println(MyMath2.multiply(10L, 5L));
		System.out.println(MyMath2.divide(10, 5));
		
		MyMath2 mm2 = new MyMath2();
		mm2.a = 10L;
		mm2.b = 5L;
		
		System.out.println("----");
		System.out.println(mm2.add());
		System.out.println(mm2.subtract());
		System.out.println(mm2.multiply());
		System.out.println(mm2.divide());

	}

}
