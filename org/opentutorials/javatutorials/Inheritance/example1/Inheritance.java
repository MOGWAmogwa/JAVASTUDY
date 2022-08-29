package org.opentutorials.javatutorials.Inheritance.example1;


class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right );
	}
}

class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right );
	}
}

class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right );
	}
}

public class Inheritance {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
		MultiplicationableCalculator c2 =  new MultiplicationableCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.multiplication();
		
		DivisionableCalculator c3 =  new DivisionableCalculator();
		c3.setOprands(10, 20);
		c3.sum();
		c3.avg();
		c3.division();
	}

}

