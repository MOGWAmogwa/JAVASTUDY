package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1_repeat1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("apple");
		
		list.add("kiwi");
		
		list.add("banana");
		
		list.add("strawberry");
		
		list.add("peach");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		

	}

}
