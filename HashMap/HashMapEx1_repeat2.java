package HashMap;

import java.util.*;

public class HashMapEx1_repeat2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();

		map.put("test1", "1234");
		map.put("test2", 2345);

		while(true) {


			Scanner s = new Scanner(System.in);
			
			System.out.println("enter your id and password");
			
			System.out.println("id : ");
			
			String id = s.nextLine().trim();
		
			System.out.println("pw : ");
			
			
			String password = s.nextLine().trim();
		
			System.out.println("password : ");
			
			if(!map.containsKey(id)) {
				System.out.println("invalid id");
				continue;
			}else {
				if(!(map.get(id).equals(password))) {
					System.out.println("invalid password");
				} else {
					System.out.println("id ===password");
					break;
				}
				
			}
			
			
			
			
			
			
			
		}

	}

}
