package Iterator;
import java.util.*;

public class IteratorEx1_repeat3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("computer");
		list.add("TV");
		list.add("Radio");
		list.add("iMac");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
