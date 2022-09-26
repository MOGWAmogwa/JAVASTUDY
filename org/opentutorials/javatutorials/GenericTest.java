package java_repeat;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // jdk 1.5  이후부터는 반드시 지네릭스를 사용해야 함.
//		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30); // String  추가  -> 지네릭스를 사용하면 타입체크가 강화된다. 
		
		Integer i = list.get(2); // Object 타입으로 반환
		
		
		System.out.println(list);
		

		
		

	}

}
