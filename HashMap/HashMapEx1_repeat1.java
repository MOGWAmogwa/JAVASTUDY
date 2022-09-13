package HashMap;

import java.util.*;
public class HashMapEx1_repeat1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("bina", "1234");
		map.put("mina", "2342");
		
		Scanner s = new Scanner(System.in); // 화면으로부터 라인 단위로 입력 받는다. 
		
		while(true) {
			System.out.println("Please enter your ID & PW");
			
			System.out.println("id : ");
			
			String id = s.nextLine().trim();
			
			System.out.println("password : ");
			
			String password = s.nextLine().trim();
		
			if (!map.containsKey(id)) {
				System.out.println("invalid id");
				continue;
				
			} else {
				if (!(map.get(id).equals(password))) {
					System.out.println("invalid id");
				}else {
					System.out.println("id==password");
					break;
				}
			}
		
			
	
			
		}

		

	}

}
