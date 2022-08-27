package Casting;

 class CastingTest1 {

	 static void main(String[] args) {
		MyCar car = null ;
		MyFireEngine fe = new MyFireEngine();
		MyFireEngine fe2 = null;
		
		fe.water();
		car = fe; 
//		car.water();
		fe2 = (MyFireEngine)car;
		fe2.water();
		
		
	}

}


class MyCar{
	String color;
	int door;
	
	void drive() {
		System.out.println("drvie");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
}

class MyFireEngine extends MyCar{
	void water() {
		System.out.println("water");
	}
}