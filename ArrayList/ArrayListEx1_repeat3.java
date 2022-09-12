package ArrayList;

import java.util.*;

public class ArrayListEx1_repeat3 {

	public static void main(String[] args) {
		ArrayList animals = new ArrayList(10);
		
		animals.add("lion");
		animals.add("tiger");
		animals.add("bear");
		animals.add("eagle");
		animals.add("whale");
		animals.add("deer");
		animals.add("cow");
		animals.add("rabbit");
		
		ArrayList herbivore = new ArrayList(animals.subList(5, 8));
		
		System.out.println(herbivore);
		
		ArrayList carnivore = new ArrayList(5);

		for (int i = animals.size()-1  ; i >=0 ; i-- )
			if(herbivore.contains(animals.get(i))==false)
				carnivore.add(animals.get(i));
		
		System.out.println(carnivore);
		

	}

}
