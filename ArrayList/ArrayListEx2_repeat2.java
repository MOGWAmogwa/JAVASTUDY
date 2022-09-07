package ArrayList;
import java.util.*;

public class ArrayListEx2_repeat2 {

	public static void main(String[] args) {
		final int LIMIT = 10; 
		String str = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()HAPPY";
		int length = str.length();
		
		
		List myList = new ArrayList(length / LIMIT + 10 );
		
		for(int i = 0 ; i < length; i += LIMIT) {
			if(i + LIMIT < length)
				myList.add(str.substring(i, i+LIMIT));
			else 
				myList.add(str.substring(i));
			
		}
		
		System.out.println(myList);
		
		for(int i = 0 ; i < myList.size() ; i++) {
			System.out.println(myList.get(i));
		}
		
		
		
		
		
		

	}

}
