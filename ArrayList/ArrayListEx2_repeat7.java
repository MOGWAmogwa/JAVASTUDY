package ArrayList;

import java.util.*;

public class ArrayListEx2_repeat7 {

	public static void main(String[] args) {
		
		int LIMIT = 4;
		
		String str = "aaaabbbbccccddddeeeeffffzzz";
		
		int length = str.length();
		
		List list = new ArrayList(length/LIMIT);
		
		for(int i = 0 ; i < length ; i+=LIMIT)
			if(i+LIMIT < length)
				list.add(str.substring(i, i+LIMIT));
			else
				list.add(str.substring(i));
		

		System.out.println(list);
	}

}
