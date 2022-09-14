package Iterator;
import java.util.*;

public class IteratorEx1_repeat4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("ad");
		list.add("add");
		list.add("afs");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
