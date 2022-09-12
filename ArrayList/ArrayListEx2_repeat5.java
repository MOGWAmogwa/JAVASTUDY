package ArrayList;

import java.util.*;

public class ArrayListEx2_repeat5 {

	public static void main(String[] args) {
		int LIMIT = 5 ; 
		String str = "HappyApplePorchForcePeachKiwi";
		int length = str.length();
		
		List fiveWords = new ArrayList( length / LIMIT );
		
		for (int i = 0 ; i < length ; i += LIMIT) {
			if (i + LIMIT < length)
				fiveWords.add(str.substring(i, i+LIMIT));
			else
				fiveWords.add(str.substring(i));
				
		}
		
		System.out.println(fiveWords);
		
		
	}

}
