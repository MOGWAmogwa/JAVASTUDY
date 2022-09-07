package string;

public class stringIndexOf_subString {

	public static void main(String[] args) {
		String fullname = "Hello.java";
		
		int index = fullname.indexOf('.');
		
		String filename = fullname.substring(0, index);
		
		String ext = fullname.substring(index+1);
		
		System.out.println(ext);
		

		
	}

}
