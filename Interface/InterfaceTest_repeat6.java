package Interface;

interface I6 {
	public void method();
}

class A6 implements I6 {
	public void method() {
		System.out.println("this is A6 class");
	}
}

class B6 implements I6 {
	public void method() {
		System.out.println("this is B6 class");
	}
}

class C6 {
	public void method(I6 i) {
		i.method();
	}
}




public class InterfaceTest_repeat6 {

	public static void main(String[] args) {
		C6 c = new C6();
		
		c.method(new A6());

	}

}
