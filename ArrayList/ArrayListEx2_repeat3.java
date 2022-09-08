package ArrayList;
import java.util.*;

public class ArrayListEx2_repeat3 {

	public static void main(String[] args) {
		final int LIMIT = 6; 
		String str = "01234567890abcdefghijABCDEFGHIJ!@#$%^&*()happyday";
		int length = str.length();
		
		List list = new ArrayList( length / LIMIT + LIMIT);

		for (int i = 0 ; i < length ; i += LIMIT) {
			if (i+LIMIT < length )
				list.add(str.substring(i, i+LIMIT));
			else 
				list.add(str.substring(i));
					
			
		}
		
		System.out.println(list);
	}

}
