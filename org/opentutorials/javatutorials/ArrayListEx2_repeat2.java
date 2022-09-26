package java_repeat;
import java.util.*;

public class ArrayListEx2_repeat2 {

	public static void main(String[] args) {
		
		int LIMIT = 4;
		
		String str = "12341234123412341234123412";
		
		int length = str.length();
		
		List strArr = new ArrayList( (length + LIMIT) / LIMIT );
		
		for(int i = 0 ; i < length ; i += LIMIT) {
			if (i+LIMIT < length) {
				strArr.add(str.substring(i, i+LIMIT));
			}else {
				strArr.add(str.substring(i));
			}
		}

		System.out.println(strArr);
		
		
		
	}

}
