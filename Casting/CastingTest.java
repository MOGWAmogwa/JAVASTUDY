package Casting;

 class CastingTest {

	 static void main(String[] args) {
		MyCar car = null;
		MyFireEngine fe = null; // important what practical instance is. 실제 인스턴스가 무엇인지가 중요
//		// 실제 객체의 멤버면수가 몇개인지를 봐야함 
//		// 5개만 안넘으면 돼.
//		
//		// 참조변수가 가리키는 실제 객체의 멤버변수가 몇 개인지가 중요 
//		// 조상-자손 관계면 무조건 성립하기 때문에.
//
		MyFireEngine fe2 = (MyFireEngine)car; 
		MyCar car2 = (MyCar)fe2;
		car2.drive(); // NullPointerException 발생
		
		
//		Car c = new Car();
//		FireEngine fe = (FireEngine)c; // 형변환 실행에러 java.lang.ClassCastException
//		fe.water(); // 컴파일 오케이 (형변환 타입만 맞으면 컴파일러는 속아서 ok가 됨)
//		
//		FireEngine fe = new FireEngine();
//		Car c = (Car)fe;
//		c.stop();
	}	

}

class Car{
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrr");
	}

	void stop() {
		System.out.println("drive, Brrr");
	}


}


class FireEngine extends MyCar{
	void water() {
		System.out.println("water");
	}
}