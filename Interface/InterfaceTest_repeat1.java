package Interface;


class A {
	public void method(I i) {
		i.method();
	}
}

interface I {
	void method();
}

class B implements I{
	public void method() {
		System.out.println("class B's method()");
	}
}

class C implements I{
	public void method() {
		System.out.println("class C's method()");
	}
}



public class InterfaceTest_repeat1{
	public static void main (String[] args) {
		A a = new A();
		a.method(new B());
			 
	}
}



//
//class A1 {
//	public void method(C1 b) {
//		b.method();
//	}
//}
//
//class B1 {
//	public void method() {
//		System.out.println("class B1's method() ");
//	}
//}
//
//class C1 {
//	public void method() {
//		System.out.println("class C1's method() ");
//	}
//}
//
//
//public class InterfaceTest_repeat1 {
//
//	public static void main(String[] args) {
//		A1 a = new A1();
//		a.method(new C1());
//
//	}
//
//}

