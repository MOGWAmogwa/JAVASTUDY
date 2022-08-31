package Casting;

 class CastingTest1 {

	 public static void main(String[] args) {
		MyCar car = null ;
		MyFireEngine fe = new MyFireEngine();
		MyFireEngine fe2 = null;
		
//		MyFireEngine fe3 = null;
//		MyCar car2 = new MyCar();
//		fe3 = car2; // 자동 형변환이 안되는 상황, 다형성 규칙 위
//		
		



		fe.water();
		car = fe; 
//		car.water();
		fe2 =(MyFireEngine) car;
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