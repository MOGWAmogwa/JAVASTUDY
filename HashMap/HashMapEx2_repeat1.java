package HashMap;

import java.util.*;

public class HashMapEx2_repeat1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("HONG", 90);
		map.put("KIM", 80);
		map.put("LEE", 90);
		map.put("BYEON", 100);
		map.put("PARK", 70);
		map.put("AN", 95);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name : " + e.getKey() + ", score : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("Participants list  : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("total score : " + total);
		System.out.println("average : " + (float)total/set.size());
		System.out.println("best score : " + Collections.max(values));
		System.out.println("worst score : " + Collections.min(values));

	}

}
