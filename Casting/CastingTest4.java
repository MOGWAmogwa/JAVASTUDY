package Casting;

public class CastingTest4 {

	public static void main(String[] args) {
		Car4 c = new FireEngine4();
		Car4 c1 = new Car4();
		FireEngine4 fe = new FireEngine4();
		
		c = (Car4)fe;
		c1 = c;
		
		

	}

}

class Car4{
	int door;
	String color;
	
	void move() {
		System.out.println("move");
	}
}


class FireEngine4 extends Car4 {
	
	void water() {
		System.out.println("water");
	}
}


