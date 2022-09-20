package TIS_JAVA_STUDY;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		
		String animals = "tiger,lion,wolf,rabbit";
		
		String[] carnivore = animals.split(",");
		
		System.out.println(carnivore);
		
		StringJoiner sj = new StringJoiner("-", "[", "]");
		
		for (String item : carnivore) {
			sj.add(item);
		}
		
		System.out.println(sj);

	}

}
