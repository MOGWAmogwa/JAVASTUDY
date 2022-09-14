package Iterator;
import java.util.*;

public class IteratorEx2_repeat3 {

	public static void main(String[] args) {
		
		ArrayList original = new ArrayList();
		
		ArrayList copy1 = new ArrayList();
		ArrayList copy2 = new ArrayList();
		
	
		
		for (int i = 0 ; i < 10 ; i ++) {
			original.add(i+"");
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		
		System.out.println(original);
		System.out.println(copy1);

	}

}
