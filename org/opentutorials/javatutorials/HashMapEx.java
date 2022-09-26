package java_repeat;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("hong", 100);
		map.put("park", 80);
		map.put("kim", 10);
		map.put("lee", 80);
		
		Set entry = map.entrySet();
		Iterator it = entry.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getValue());
		}
		
		Set set = map.keySet();
		
		Collection values = map.values();
		
		int total = 0 ; 
		
		it = values.iterator(); // Interface? collection 에 저장된  데이터에 접근하는데 사용되는 인터페이스 
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println(total);
		System.out.println(total/set.size());
		
		
	}

}
