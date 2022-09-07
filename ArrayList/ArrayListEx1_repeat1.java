package ArrayList;
import java.util.*;

public class ArrayListEx1_repeat1 {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList(10);
		
		l.add(1);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(6);
		l.add(0);
		
		System.out.println(l);
		
		l.add("hi");
		
		System.out.println(l);
		
		l.remove(l.size()-1);
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);

		String str = "0123456789XJQK";
		
		int index = str.indexOf("X");
		
		String numbers = str.substring(0, index+1);
		
		System.out.println(numbers);
		
		String JQK = str.substring(index+1);
		
		System.out.println(JQK);
		
		ArrayList animals = new ArrayList(10);
		
		animals.add("dog");
		animals.add("cat");
		animals.add("deer");
		animals.add("lion");
		animals.add("bird");
		animals.add("cow");
		animals.add("rabbit");
		animals.add("tiger");
		
		System.out.println(animals);
		
		animals.add(2,"bear");
		
		System.out.println(animals);
		
		
		ArrayList herbivore = new ArrayList(3);
		
		herbivore.add("deer");
		
		herbivore.add("cow");
		
		herbivore.add("rabbit");
		
		
		System.out.println(herbivore);
		

		
		System.out.println(animals.containsAll(herbivore));
		
		animals.retainAll(herbivore);
		
		System.out.println(animals);
		
		for (int i = animals.size()-1 ; i >=0 ; i--)
			if(animals.contains(herbivore.get(i)))
				herbivore.remove(i);

		


		

		
		
			
	
	}

}
