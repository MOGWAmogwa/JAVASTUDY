package Interface;

class A3 { 
	public void method(I i) {
		i.method();
	}
}

interface I {
	public abstract void method();
}

class B3 implements I {
	public void method() {
		System.out.println("print B method");
	}
}

class C3 implements I {
	public void method() {
		System.out.println("print C method");
	}
}
public class interfaceTest_repeat3 {

	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.method(new C3());

	}

}




//package Interface;
//
//class A3{
//	public void method(C3 b) {
//		b.method();
//	}
//}
//
//
//class B3 {
//	public void method() {
//		System.out.println(" class B method() print");
//	}
//}
//
//class C3{
//	public void method() {
//		System.out.println(" class B method() print");
//	}
//}
//public class interfaceTest_repeat3 {
//
//	public static void main(String[] args) {
//		A3 a3 = new A3();
//		a3.method(new C3());
//
//	}
//
//}


