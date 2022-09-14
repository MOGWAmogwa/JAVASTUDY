package HashMap;
import java.util.*;

public class HashMapEx1_repeat4 {

	public static void main(String[] args) {
		
		
		HashMap map = new HashMap();
		
		map.put("id", "pw");
		map.put("asdf1234", "1234");
		map.put("admin", "1234");
		map.put("af", "pgssgw");
		
		while(true) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("id : ");
			String id = s.nextLine();
			
			System.out.println("pw : ");
			String pw = s.nextLine();
			
			if(!map.containsKey(id)) {
				System.out.println("invalid id");
				continue;
			} else {
				if(!(map.get(id).equals(pw))) {
					System.out.println("invalid pw");
				}else {
					System.out.println("log in");
					break;
				}
			}
		
		}
		
		

	}

}
