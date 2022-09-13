package ArrayList;

import java.util.*;

public class ArrayListEx2_repeat8 {

	public static void main(String[] args) {
		int LIMIT = 5;
		String str = "abcde12345fghij6789Xqew";
		
		int length = str.length();
		
		List list = new ArrayList(length/LIMIT);
		
		for (int i = 0 ; i < length ; i = i + LIMIT)
			if (i+LIMIT < length)
				list.add(str.substring(i, i+LIMIT));
			else 
				list.add(str.substring(i));
					
		
		System.out.println(list);

	}

}
