package HashMap;
import java.util.*;

public class HashMapEx4_repeat1 {

	public static void main(String[] args) {
	
	String[] data = {"A", "A", "A", "B", "B", "C"};
	
	HashMap map = new HashMap();
	
	for(int i = 0 ; i < data.length ; i++) {
		
		if(map.containsKey(data[i])) {
			int value = ((Integer)map.get(data[i])).intValue();
			map.put(data[i], value+1);
		}else {
			map.put(data[i], 1);
		}
		
		
	}
	
	Iterator it =map.entrySet().iterator();
	
	while(it.hasNext()) {
		Map.Entry entry = (Map.Entry)it.next();
		Integer value = (Integer)entry.getValue();
		System.out.println(entry.getKey() + " : " +  printBar('#', value));
	}

	}
	
	public static String printBar(char c , int value) {
		char[] bar = new char[value];
		
		for(int i = 0 ; i < bar.length ; i++) {
			bar[i] = c;
		}
		
		return new String(bar);
	}

}
