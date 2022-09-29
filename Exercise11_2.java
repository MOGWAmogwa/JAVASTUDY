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
//		HashSet set = new HashSet(list); // 2,6,3,7 중복요소들이 제거되고 순서유지 안
//		TreeSet tset = new TreeSet(set); // 2,3,6,7 
//		Stack stack = new Stack(); // stack에 넣었다 빼면 저장순서가 반대가 된다. 
//		stack.addAll(tset); // TreeSet 의 저장된 모든 요소를  stack에 담는다.
//		
//		while(!stack.empty()) {
//			System.out.println(stack.pop()); // stack에 저장된 값을 하나씩 꺼낸다. 
//		}
//
//
//	}
//
//}
