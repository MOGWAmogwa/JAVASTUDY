package InnerTest;

class A{
	int i = 100;
	
	class B {
		void method() {
			System.out.println(i);
		}
	}
}



public class InnerTest_repeat2 {

	public static void main(String[] args) {
		A a = new A();

	}

}
