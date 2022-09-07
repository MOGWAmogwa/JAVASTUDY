package string;



class stringChar {
	public static void main(String[] args) {
		// 길이가 0인 char배열을 생성한다.
		char[] cArr = new char[0];   // char[] cArr = {};와 같다.
		String s = new String(cArr); // String s = new String("");와 같다.

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}

//class stringSpace {
//	public static void main(String[] args) {
//		char[] c = {'h', 'e', 'l', 'l', 'o'};
//		String s = new String(c);
//		
//		char[] c2 = new char[0]; // char[] c2 = {};
//		String s2 = new String(c2);
//		
//		System.out.println(c2);
//		System.out.println("s2 = "+s2);
//	}
//}