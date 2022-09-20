package TIS_JAVA_STUDY;
import java.util.*;

public class ArrayListEx_repeat1 {

	public static void main(String[] args) {
		
		ArrayList animals =  new ArrayList(8);

		animals.add("tiger");
		animals.add("lion");
		animals.add("wolf");
		animals.add("whale");
		animals.add("eagle");
		
		animals.add("rabbit");
		animals.add("deer");
		animals.add("cow");
		
		ArrayList harbivore = new ArrayList(animals.subList(5, 8));
		
		ArrayList carnivore = new ArrayList(animals.size()-harbivore.size());
		
		for (int i = 0 ; i < animals.size() ;  i++) {
			if(!harbivore.contains(animals.get(i)))
				carnivore.add(animals.get(i));
		
		}
		
		System.out.println(carnivore);
		System.out.println(harbivore);
		

		
		

	}

}
