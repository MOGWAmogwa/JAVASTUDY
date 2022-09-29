package java_castle;

public class IndexOfEx {

	public static void main(String[] args) {
//		String str = "aabaaaaba";
//		
//		System.out.println(str.indexOf("b", 4)); // 7
//		
//		String str2 = "happy sunday";
//		System.out.println(str2.indexOf("a",3)); // 10
		
		int pos = 0;
		String src = "12345AB12AB345AB";
		
		String target = "AB";
		
		System.out.println(src.indexOf(target, pos));
		System.out.println(src.indexOf(target, 6));
		System.out.println(src.indexOf(target,15));
	}

}
