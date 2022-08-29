package org.opentutorials.javatutorials.classinstance;


class Calculator {
	static double Pi = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);

	}
	
	public void avg() {
		System.out.println((this.left + this.right + base) / 2);
		
	}
}
public class CalculatorDemo1 {

	public static void main(String[] args) {

	Calculator c1 = new Calculator();
	c1.setOprands(10, 20);
	System.out.println(c1.Pi);
	c1.sum();
	c1.avg();
	
	Calculator c2 = new Calculator();
	c2.setOprands(20, 30);
	c2.sum();
	c2.avg();
	
	Calculator.base = 10;
	System.out.println(Calculator.Pi);
	
	c1.sum();
	c1.avg();
	c2.sum();
	c2.avg();
	
	

	}

}
