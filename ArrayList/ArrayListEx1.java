package ArrayList;

import java.util.*;

// 남궁성 깃허브 가서 ArrayListEx1 다시 보기 여기다가 복사 붙여넣기 안했음 할때마다 들어가서 보기 

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("list1 " + list1);
		System.out.println("list2 " + list2);
		
		System.out.println(list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		
		System.out.println(list2);
		
		list2.add(3, "A");
		
		System.out.println(list2);
		
		
		// list 1 에서 list 2와 겹치는 부분만 남기고 나머지는 삭제한다. 
		list1.retainAll(list2);
		System.out.println( "list1 : " + list1);
		
		
		// list2 에서 list1 에 포함된 객체들을 삭제한다.
		
		System.out.println("list2 : " + list2);
		for (int i = list2.size()-1 ; i >= 0 ;  i--)
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		
		System.out.println("list : expect : abc?" + list2);
		
		System.out.println(list2.get(2));
	}

}
