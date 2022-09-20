package TIS_JAVA_STUDY;

public class InterfaceABC {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
//		a.method(new C()); 인터페이스 미사용시 오버로딩 해야 하는 번거로움이 생김
		a.method(new C()); 
		a.method(new D()); 
		
	}

}


interface I {
	void testMethod();
}


//class A {
//	
//	void method(B b) {
//		b.methodB();
//	}
//}

class A {
	
	void method(I i) {
		i.testMethod();
	}
}


class B implements I {
	
	public void testMethod () {
		System.out.println("this is b class");
	}
	
	public String toString() {
		return "b";
	}
}

class C implements I {
	
	public void testMethod () {
		System.out.println("this is c class");
	}
	
	public String toString() {
		return "c";
	}
}

class D implements I {
	
	public void testMethod () {
		System.out.println("this is d class");
	}
	
	public String toString() {
		return "d";
	}
}