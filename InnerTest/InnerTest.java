package InnerTest;

class A{
	int i = 100; 
	
	class B{
		void method () {
			System.out.println(i);
		}
	}

}


//class C{
//	B b = new B();
//}

public class InnerTest {

	public static void main(String[] args) {
//		B b = new B();
//		b.method();
		
		A a = new A();
		 

	}

}

//
//package InnerTest;
//
//class A{
//	int i = 100; 
//	B b = new B();
//}
//
//class B{
//	void method () {
//		A a = new A();
//		System.out.println(a.i);
//	}
//}
//
//class C{
//	B b = new B();
//}
//
//public class InnerTest {
//
//	public static void main(String[] args) {
//		B b = new B();
//		b.method();
//
//	}
//
//}
