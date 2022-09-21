package java_repeat;
import java.util.*;
public class HashMapEx_repeat4 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("hong", 100);
		map.put("kim", 100);
		map.put("park", 100);
		map.put("jung", 100);
		
		
		Set name = map.keySet();
		
		Collection score = map.values(); 
		
		Iterator it = score.iterator();
		
		int total = 0 ; 
		
		// Æò±ÕÁ¡¼ö
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i ; 
		}
		
		System.out.println("average : " + total/name.size());
		
		

	}

}
