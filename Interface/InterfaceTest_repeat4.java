package Interface;

public class InterfaceTest_repeat4 {

	public static void main(String[] args) {
		A4 a = new A4();
		a.method(new C4());

	}

}

interface I4 {
	public void method();
}

class A4 {
	public void method(I4 i) {
		i.method();
	}
}

class B4 implements I4 {
	public void method() {
		System.out.println("this is class B");
	}
}

class C4 implements I4 {
	public void method() {
		System.out.println("this is class C");
	}
}


