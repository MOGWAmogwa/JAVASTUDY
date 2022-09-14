package HashMap;

import java.util.*;

public class HashMapEx1_repeat5 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("hongbin12345@naver.com", "todayis0914");
		map.put("ighahyk5@naver.com", "tommorowis0915");
		
		while(true) {
	
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("id : ");
			String id = scanner.nextLine();
			
			System.out.println("pw : ");
			String pw = scanner.nextLine();
			
			if(!map.containsKey(id)) {
				System.out.println("invalid id");
				continue;
			}else {
				if(!(map.get(id).equals(pw))) {
					System.out.println("invalid pw");
				}else {
					System.out.println("[--log in--]");
					break;
				}
			}
			
			
			
			
			
		}


	}

}
