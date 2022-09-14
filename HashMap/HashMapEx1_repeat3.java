package HashMap;
import java.util.*;

public class HashMapEx1_repeat3 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("id", "pw");
		map.put("asdf", "12341234");
		map.put("asdfasdf", "13412");
		map.put("asdfasdfadsf", "123424");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter your ID & PW");
			
			System.out.println("ID : ");
			
			String id = sc.nextLine().trim();
			
			System.out.println("PW : ");
			
			String pw = sc.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("your id is invalid");
				continue;
			} else {
				if (!(map.get(id).equals(pw))) {
					System.out.println("your pw is invalid");
				}else {
					System.out.println("log-in");
					break;
				}
			}
			
			
		}
		
		
		
		

	}

}
