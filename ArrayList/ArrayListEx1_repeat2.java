package ArrayList;
import java.util.*;

public class ArrayListEx1_repeat2 {

	private static Object List;

	public static void main(String[] args) {
		ArrayList animals  = new ArrayList(5);
		
		animals.add("lion");
		animals.add("cow");
		animals.add("rabbit");
		animals.add("tiger");
		animals.add("bear");
		animals.add("eagle");
		animals.add("whale");
		animals.add("deer");


		ArrayList herbivore = new ArrayList(3);
		
		herbivore.add("rabbit");
		herbivore.add("deer");
		herbivore.add("cow");
	
		
		
		ArrayList carnivore = new ArrayList(animals.size() - herbivore.size());

		
		for (int i = animals.size() - 1 ;  i >= 0 ; i--)
			if (herbivore.contains(animals.get(i))==false)
				carnivore.add(animals.get(i));

		System.out.println(carnivore);
		System.out.println(herbivore);
		System.out.println(animals);
		
		

		

	}

}
