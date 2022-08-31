package InnerTest.outer;

class Outer {
	private int outerIv = 0;
	private static int outerCv = 0; 
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		final int lv = 0 ;  // 값이 바뀌지 않는 변수는 상수로 간주한다. 
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = lv; // 원래는 에러가 나야 하는데 JDK 1.8 부터는 에러 아님, lv 값이 안바뀌면 상수로 취급
			int liv4 = LV;
			
			void method() {
				System.out.println(lv);
			}
		}
	}
}

public class innerClass_modifier_module_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
