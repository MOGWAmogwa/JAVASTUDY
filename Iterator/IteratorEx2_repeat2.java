package Iterator;

import java.util.*;

public class IteratorEx2_repeat2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for (int i = 0 ; i < 10 ; i++) {
			original.add(i);
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		
		it = original.iterator();
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		
		}
	
		System.out.println(original);
		System.out.println(copy1);
		System.out.println(copy2);
		

	}

}
