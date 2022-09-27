package java_repeat;
import java.util.*;

public class TreeSetEx3_repeat5 {

	public static void main(String[] args) {
//		TreeSet set = new TreeSet();
		HashSet set = new HashSet();
		
		int[] t  = {2,5,6,2,4,3,6,8};
		
		for(int i = 0 ; i < t.length ; i++) {
			set.add(t[i]);
		}
		
		System.out.println(set);
		

	}

}
