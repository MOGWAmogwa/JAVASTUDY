package java_repeat;
import java.util.*;
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // jdk 1.5  ���ĺ��ʹ� �ݵ�� ���׸����� ����ؾ� ��.
//		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30); // String  �߰�  -> ���׸����� ����ϸ� Ÿ��üũ�� ��ȭ�ȴ�. 
		
		Integer i = list.get(2); // Object Ÿ������ ��ȯ
		
		
		System.out.println(list);
		

		
		

	}

}
