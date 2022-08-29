package Interface;

interface I {
	public void method();
	
}

class A { 
	public void method(I i) { // 인터페이스를 구현한 클래스의 객체만 들어올 수 있음!
		i.method();
	}
}

class B implements I {
	public void method() {
		System.out.println(" Class B's method() ");
	};
}


class C implements I {
	public void method() {
		System.out.println(" Class C's method() ");
	};
}



public class InterfaceTest{
	public static void main(String[] args) {
	
		A a = new A();
		a.method(new B());
		a.method(new C());

	}

}


//package Interface;
//
//class A { // 인터페이스를 안쓰고 이렇게 쓰면 A 클래스도 변경해야함 
//	public void method(C b) {
//		b.method();
//	};
//}
//
//class B {
//	public void method() {
//		System.out.println("Class B's method()");
//	}
//}
//
//class C {
//	public void method() {
//		System.out.println("Class C's method()");
//	}
//}
//
//
//
//public class InterfaceTest {
//
//	public static void main(String[] args) {
//		A a = new A();
//		a.method(new C()); // A가 B를 사용 = A가 B에 의존하고 있다.
//
//	}
//
//}
// 

