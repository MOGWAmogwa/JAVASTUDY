package java_repeat;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList animals = new ArrayList(10);
		animals.add("tiger");
		animals.add("eagle");
		animals.add("bear");
		animals.add("lion");
		animals.add("wolf");
		animals.add("deer");
		animals.add("rabbit");
		animals.add("duck");
		animals.add("bird");
		animals.add("mouse");


		ArrayList herbivore = new ArrayList(animals.subList(5, 10));
		ArrayList carnivore = new ArrayList();



		for(int i = 0 ; i < animals.size(); i ++) {

			if(!herbivore.contains(animals.get(i))) {
				carnivore.add(animals.get(i));
			}
		}
		
		System.out.println(carnivore);
		
		animals.retainAll(herbivore);
		
		System.out.println(animals);




	}

}
