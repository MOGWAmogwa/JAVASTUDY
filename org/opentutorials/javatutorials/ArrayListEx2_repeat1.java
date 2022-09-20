package TIS_JAVA_STUDY;
import java.util.*;

public class ArrayListEx2_repeat1 {

	public static void main(String[] args) {
		
		String str = "123451234512345";
		
		int LIMIT = 6;
		
		int length = str.length();
		
		ArrayList strArr = new ArrayList();
		
		for (int i = 0 ; i < length ; i += LIMIT ) {
			if (i+LIMIT < length)
				strArr.add(str.substring(i, i+LIMIT));
			else 
				strArr.add(str.substring(i));
		}
		
	}

}
