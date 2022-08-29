package modifier.staticFinalAbstract;


class Static {
	static int width = 100;
	static int height = 200;
	
	static {
		// static 변수의 복잡한 초기화 수행
		
	}
	
	static int max (int a , int b) {
		return a> b ? a : b;
	}
	
}

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Static.width);
		System.out.println(Static.height);
		System.out.println(Static.max(10, 30));
		

	}

}
