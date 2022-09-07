package string;

public class stringIndexOf_subString_repeat2 {

	public static void main(String[] args) {
		String fullname = "subStringIndexOf.java";
		
		int index = fullname.indexOf('.');
		
		String filename = fullname.substring(0, index);
		
		System.out.println("filename : " + filename);
		
		String ext = fullname.substring(index+1);
		
		System.out.println("ext : " + ext);

	}

}
