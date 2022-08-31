package exceptionbHandling;

public class Exception_PrintStackTrace_getMassage {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch (ArithmeticException ae){ // 객체 생성하고 참조변수로 객체 참조하는 거랑 똑같음
			ae.printStackTrace();
			System.out.println(" Exception Message : " + ae.getMessage());
		} // try-catch 의 끝
		System.out.println(6);

	}

}
