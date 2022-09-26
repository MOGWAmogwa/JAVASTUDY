package TIS_JAVA_STUDY;

public class TIS_var_casting_repeat1 {

	public static void main(String[] args) {
		/* byte => short => int => long => float => double*/
		
		int i = 300;
		byte j = (byte)i;
		
		
		double x = 300;
		int y = (int)x;
		
		int a = 300;
		double b = a;
		
		
		byte a1 = 30;
		byte a2 =40;
		
		byte result = (byte)(a1+a2); // 이렇게 형변환을 하던가 
		int result_ = a1+a2; // int로 바꾸던가 해야함
		

	}

}
