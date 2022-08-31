package InnerTest;



class InnerClass_ICCCLCTest {

	class InstanceInner {
		int iv = 10; 
		//			static int cv = 100;

		final static int CONST = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200;

	}

	void myMethod() {
		class LocalInner{
			int iv = 300;
			//		 		static int cv = 300;
			final static int CONST = 300;
		}
		
		int i = LocalInner.CONST;
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); //error
	

		
	}

}


