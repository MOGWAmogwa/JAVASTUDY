package TIS_JAVA_STUDY;

public class Casting_repeat1 {

	public static void main(String[] args) {
		
		Car_ car = null;
		FireEngine_ fe = new FireEngine_();
		FireEngine_ fe2 = null;
		
		car = fe; 
		
		fe2 = (FireEngine_)car;
		
		

	}

}


class Car_{
	int door;
	void move () {
		System.out.println("move");
	}
	void stop () {
		System.out.println("stop");
	}
}

class FireEngine_ extends Car_{
	void water() {
		System.out.println("water");
	}
}

class Ambulance_ extends Car_{
	void load() {
		System.out.println("load");
	}
}