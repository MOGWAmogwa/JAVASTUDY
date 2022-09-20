package TIS_JAVA_STUDY;
import java.util.*;

public class HashMapEx_repeat5 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("hong", 90);
		
		map.put("mong", 70);
		
		map.put("song", 85);
		
		map.put("jong", 75);
		
		Collection score = map.values();
		
		Set student = map.keySet();
		
		
		Iterator it = score.iterator();
		
		int total = 0;
		
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println(total/student.size());
		
		
	}

}
