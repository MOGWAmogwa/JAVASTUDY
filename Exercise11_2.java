//package java_castle;
//import java.util.*;
//
//public class Exercise11_2 {
//
//	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(3);
//		list.add(6);
//		list.add(2);
//		list.add(2);
//		list.add(2);
//		list.add(7);
//		
//		HashSet set = new HashSet(list); // 2,6,3,7 �ߺ���ҵ��� ���ŵǰ� �������� ��
//		TreeSet tset = new TreeSet(set); // 2,3,6,7 
//		Stack stack = new Stack(); // stack�� �־��� ���� ��������� �ݴ밡 �ȴ�. 
//		stack.addAll(tset); // TreeSet �� ����� ��� ��Ҹ�  stack�� ��´�.
//		
//		while(!stack.empty()) {
//			System.out.println(stack.pop()); // stack�� ����� ���� �ϳ��� ������. 
//		}
//
//
//	}
//
//}
