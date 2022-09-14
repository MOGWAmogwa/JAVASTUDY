package HashSet;

import java.util.*;

public class HashSetEx1_repeat2 {

	public static void main(String[] args) {
		Object[] objArr = {"1", 1 , 1, 2, 2, 3, 3, 3};
		
		Set set = new HashSet();
		
		for (int i = 0 ; i < objArr.length ; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);

	}

}
