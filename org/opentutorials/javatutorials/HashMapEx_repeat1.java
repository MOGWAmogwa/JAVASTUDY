package java_repeat;
import java.util.*;

public class HashMapEx_repeat1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("HONG", 100);
		map.put("KIM", 70);
		map.put("PARK", 60);
		map.put("JUNG", 90);
		
		Set entrySet = map.entrySet();
		
		Iterator it = entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
		}
		
		Set keySet = map.keySet();
		
		it = keySet.iterator();
		
		Collection values = map.values();
		
		int total = 0 ; 
		
		it = values.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("average : " + total/keySet.size());
		
		
	}

}
