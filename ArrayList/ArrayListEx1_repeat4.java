package ArrayList;

import java.util.ArrayList;

public class ArrayListEx1_repeat4 {

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
		
		ArrayList carnivore = new ArrayList();
		

		for (int i = 0 ; i < animals.size() ; i++) 
			if(herbivore.contains(animals.get(i)) == false)
				carnivore.add(animals.get(i));
		
		
		System.out.println(carnivore);
	}

}
