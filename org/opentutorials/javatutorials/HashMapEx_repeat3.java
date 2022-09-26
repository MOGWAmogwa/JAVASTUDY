package java_repeat;
import java.util.*;
public class HashMapEx_repeat3 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("hong", 100);
		map.put("park", 80);
		map.put("kim", 70);
		map.put("jung", 60);
		
		Set student = map.keySet();
		
		Collection score = map.values();
		
		Iterator it = score.iterator();
		
		int totalScore = 0 ; 
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			totalScore += i.intValue();
			
			
		}
		
		System.out.println("average : " + totalScore / student.size() );
		
		

	}

}
