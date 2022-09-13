package HashMap;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asd", "1111");
		map.put("few", "1234");
		
		Scanner s = new Scanner (System.in); //화면으로부터 라인 단위로 입력받는다. 
		
		while(true) {
			
			System.out.println("please enter your id and password");
			
			System.out.println("id :");
			
			String id = s.nextLine().trim();
			
			System.out.println("please enter your id and password");
			
			System.out.println("password :");
			
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("invalid id, please retry");
				continue;
				
			} else {
				if (!(map.get(id).equals(password))) {
					System.out.println("invalid password");
					
				} else {
					System.out.println("id == password");
					break;
				}
			}
			
			
		}

	}

}
