package Interface;

interface I1{
	public void method();
}

class A1 {
	public void method(I1 i) {
		i.method();
	}
}

class B1 implements I1{
	public void method() {
		System.out.println("this is B1 class");
	}
}

class C1 implements I1{
	public void method() {
		System.out.println("this is C1 class");
	}
}


public class interfaceTest_repeat5 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.method(new B1());

	}

}
