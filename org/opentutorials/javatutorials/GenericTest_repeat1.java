package java_repeat;
import java.util.*;

public class GenericTest_repeat1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
//		list.add("30"); // Integer  객체만  list에 들어갈 수 있으므로 오류가 발생한다. 
		list.add(30);
		
		System.out.println(list.get(1)); // 지네릭스를 사용하지 않는 경우에는 리턴타입이  Object이므로 
		// (Integer)list.get(1); 이런식으로 바꾸어 주어야 한다. 
		
	}

}
