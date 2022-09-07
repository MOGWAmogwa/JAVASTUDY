package exercise_7;

class Parent {
	int x = 100;
	
	Parent(){
		this(200);
	}
	
	Parent(int x){
		this.x = x;
	}
	
	int getX() { // 조상인 Parent 클래스에 정의되었기 때문에 Parent 클래스의 인스턴스 변수 x 를 리턴
		return x;
	}
	
	
}

class Child extends Parent {
	int x = 3000;
	
	Child(){
		this(1000);
	}
	
	Child(int x ){
		this.x = x;
	}
}

public class 연습문제7_7 {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println("x = " + c.getX());
	}

}
