package java_repeat;
import java.util.*;

public class HashMapEx4_repeat8 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		String[] data = {"A", "A", "B", "B", "C", "C", "C","C","C",};
		
		for (int i = 0 ; i < data.length ; i++) {
			if (map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			}else {
				map.put(data[i], 1);
			}
		} // for
		
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry entry =(Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " " + printBar('#', value) + " " + value);
		}
		
		

	} // main

	public static String printBar(char c, int value) {
		char[] bar = new char[value];
		
		for(int i = 0 ; i < bar.length ; i++) {
			bar[i] = c;
		}
		
		return new String(bar);
	}
}
