package Iterator;

import java.util.*;

public class IteratorEx1_repeat2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
	}

}
