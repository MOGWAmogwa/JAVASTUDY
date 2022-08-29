package Interface;

class A2{
	public void method(I2 i) {
		i.method();
	}
}

interface I2 {
	void method();
}

class B2 implements I2 {
	public void method() {
		System.out.println(" Class b method() execute ");
	}
}

class C2 implements I2 {
	public void method() {
		System.out.println(" Class c method() execute ");
	}
}


public class interfaceTest_repeat2{
	public static void main (String[] args) {
		A2 a = new A2();
		a.method(new B2());
	}
}

//class A1 {
//	public void method(C1 b) {
//		b.method();
//	}
//}
//
//class B1 {
//	public void method() {
//		System.out.println(" Class B Method() ");
//	}
//}
//
//class C1 {
//	public void method() {
//		System.out.println(" Class C Method() ");
//	}
//}
//
//public class interfaceTest_repeat2 {
//
//	public static void main(String[] args) {
//		A1 a = new A1();
//		a.method(new C1());
//
//	}
//
//}
