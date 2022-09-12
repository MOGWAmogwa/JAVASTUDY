package ArrayList;

import java.util.*;

public class ArrayListEx2_repeat6 {

	public static void main(String[] args) {

		int LIMIT = 4; 
		String str = "LoveTreeKiwiCodeCellBallGom";
		int length = str.length();

		List fourWords = new ArrayList( length / LIMIT );

		for (int i = 0 ; i < length ;  i+=LIMIT) 
			if (i+LIMIT < length)
				fourWords.add(str.substring(i, i+LIMIT));
			else 
				fourWords.add(str.substring(i));
		
		System.out.println(fourWords);

	}

}
