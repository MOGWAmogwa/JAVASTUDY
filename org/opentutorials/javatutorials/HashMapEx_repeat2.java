package TIS_JAVA_STUDY;
import java.util.*;

public class HashMapEx_repeat2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("hong", 100);
		map.put("kim", 90);
		map.put("park", 100);
		map.put("yoon", 100);
		
		// 평균 점수 내기
		
		Set keySet = map.keySet();
		
		Collection score = map.values(); 
		
		Iterator it = score.iterator();
		
		int total = 0 ; 
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i;
			
		}
		
		System.out.println("score average : " + total/keySet.size());

	}

}




