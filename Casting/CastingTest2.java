package Casting;

public class CastingTest2 {

	public static void main(String[] args) {
		
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		c = fe;
		
		c.stop();
		
		fe2 = (FireEngine)c;
	
		
		fe2.water();
		
		
		
		


	}

}


class Car {
	String color;
	int door;
	
	void move() {
		System.out.println("move");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("water");
	}
}