package java_repeat;
import java.util.*;

public class HashMapEx_repeat6 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("hong", 100);
		map.put("jung", 80);
		map.put("song", 87);
		map.put("gong", 90);
		
		Set student = map.keySet();
		Collection score = map.values();
		
		Iterator it = score.iterator();
		
		int totalScore = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			totalScore += i;
			
		}
			
		
		System.out.println(totalScore/student.size());
		
		
	}

}


