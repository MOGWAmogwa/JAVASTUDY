package java_repeat;

public class Casting {
	public static void main(String[] args) {
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		c = fe;
		fe2 = (FireEngine)c;
		
		c.stop();
		
		fe2.water();
		
	}
}


class Car {
	int door;
	void stop() {
		System.out.println("stop");
	}
	void move() {
		System.out.println("move");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}

class Ambulance extends Car{
	void load() {
		System.out.println("load");
	}
}