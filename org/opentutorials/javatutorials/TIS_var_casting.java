package TIS_JAVA_STUDY;

public class TIS_var_casting {
	
	// �ڹ��� ���� ch2 ���� 13������

	public static void main(String[] args) {
		int i = 300;
		byte j = (byte)i;
		
		System.out.println(j);
		
		// ���� ����ȯ �ÿ��� bit ���� �ս��� �߻� 
		
		double d = 3.14;
		
		int k = (int)d;
		
		System.out.println(k);
		
	
		// ���� Ÿ�Կ��� ū Ÿ������ �ٲٴ°Ŷ� ���ս� ����. ���� ����
		
		int l = 3;
		
		double e = l;
		
		System.out.println(e);
		
		
		// ------------------------- //
		
		byte w = 65; 
		
		char q = (char)w;
		
		System.out.println(q);
		
		
		// ����ȯ ����
		
		int x = 30;
		double y = 30.2;
		
		int z =  (int)(x+y);
		
		/*byte+byte �� ����
		 * 
		 * ����� int ���� ���� ����Ÿ���� ��� int ������ �ٲ��. 
		 * ���� �°��̶�� �θ��⵵ �Ѵ�. 
		 * 
		 * */
			
		
		byte b1 = 10;
		byte b2 = 20;
//		byte result = (byte)(b1+b2);
		int result = b1+b2;

		
		// byte + byte => int + int
		// char + byte => int + int
		// byte + short => int + int
		
		
		
		/*
		 * Ÿ���� �ٸ� �� ������ ���� ���� �� ū Ÿ���� ���󰣴�. 
		 * 
		 * int+long = long+long
		 * int + float = float + float
		 * float + double = double +double
		 * 
		 * */
		
		int x1 = 50; 
		int y1 = 10 ; 
		double z1 = y1%x1;
		System.out.println(z1);
		
		int x2 = 3; 
		int y2 = 5;
		double z2 = (double)x2 / y2 ; // ó������   int �� ���� �����̱� ������ 0�� ���͹���. ���ϴ� ����� �ƴ� 
		System.out.println(z2);
		
		
		String str = "java";
		
		double ver = 1.8;
		
		System.out.println(str + ver); // Ÿ����  String
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}

