package Casting;

public class CastingTest3 {

	public static void main(String[] args) {
		
		Car3 c = null;
		FireEngine3 fe = new FireEngine3();
		FireEngine3 fe2 = null;
		
		c = fe;
		
		fe2 = (FireEngine3)c; 
		
		// c.water <- 리모콘이 Car3 이기 때문에 water에 접근 할 수 없다. 
		
		fe2.water();
		

	}

}


class Car3 {
	
	String color;
	int door;
	
	public void move() {
		System.out.println("move");
	}
	
	public void stop() {
		System.out.println("stop");
	}
}

class FireEngine3 extends Car3{
	
	public void water() {
		System.out.println("Water");
	}
}