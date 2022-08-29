package overriding;

public class overridingTest {

	public static void main(String[] args) {
		Point3 p = new Point3(2,3);
		System.out.println(p.getLocation());
		PointChild3 p3 = new PointChild3(2,2,2);
		System.out.println(p3.getLocation());
		System.out.println(p.add());
		System.out.println(p.test());
		System.out.println(p3.test());
		
		


	}

}

class Point3 {
	int x ; 
	int y ; 

	Point3 (int x, int y) {
		this.x = x; 
		this.y = y; 
	}

	String getLocation() {
		return "x's coordinate " + x + " / y's coordinate : " + y ;
	}
	
	int add() {
		return x+y;
	}
	
	int test() {
		return this.add()*3;
	}

}

class PointChild3 extends Point3{
	int z ; 
	
	PointChild3(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + " / z's coordinate : " + z ;
	}
	
	int add() {
		return x+y+z;
	}
	
	int test() {
		return this.add()*3;
	}


}

// 오버라이딩 조건 

// 데이터 반환 타입, 메서드 이름, 매개변수 가 모두 같아야 한다 

// 접근 제어자를 조상 클래스 메서드 보다 좁은 범위로 변경할 수 없다 (public -> private 이런식으로 하면 안된다는 의미인듯)

// 예외는 조상 클래스 메서드 보다 많이 선언 할 수 없다 

// 인스턴스 메서드를 static 메서드로, 또는 그 반대로 변경할 수 없다. 