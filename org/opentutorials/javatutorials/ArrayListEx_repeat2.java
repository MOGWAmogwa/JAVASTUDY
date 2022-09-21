package java_repeat;
import java.util.*;

public class ArrayListEx_repeat2 {

	public static void main(String[] args) {
		ArrayList animals = new ArrayList(10);

		animals.add("tiger");
		animals.add("lion");
		animals.add("eagle");
		animals.add("wolf");
		animals.add("bear");
		animals.add("rabbit");
		animals.add("deer");
		animals.add("cow");
		animals.add("goat");
		animals.add("sheep");

		ArrayList herbivore = new ArrayList(animals.subList(5, 10));
		ArrayList carnivore = new ArrayList(animals.size() - herbivore.size());
		
		for(int i = 0 ; i < animals.size() ; i++) {
			if(!herbivore.contains(animals.get(i))) {
				carnivore.add(animals.get(i));
			}

		}
		
		System.out.println(carnivore);




	}


}


