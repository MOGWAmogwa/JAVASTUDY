package string;

public class stringIndexOf_subString_repeat3 {

	public static void main(String[] args) {
		String fullname = "happy.java";
		int index = fullname.indexOf(".");
		String filename = fullname.substring(0, index);
		String ext = fullname.substring(index+1);
		
		System.out.println(filename);
		System.out.println(ext);

	}

}
