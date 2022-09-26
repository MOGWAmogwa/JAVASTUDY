package java_repeat;
import java.util.*;
public class HashMapEx4_repeat3 {

	public static void main(String[] args) {
		
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		
		for (int i = 0 ; i < data.length ; i++) {
			
			if (map.containsKey(data[i])) {
//				Integer value = (Integer)map.get(data[i]); // wrapper class 
				int value = (int) map.get(data[i]); // ±âº»Çü
				map.put(data[i], value+1);
				
				
			}else {
				map.put(data[i], 1);
			}
			
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
		
		}


	}

}
