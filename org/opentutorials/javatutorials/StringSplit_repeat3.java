package java_repeat;
import java.util.*;

public class StringSplit_repeat3 {

	public static void main(String[] args) {
				
		String animals = "tiger,lion,bear";
		
		String[] carnivore = animals.split(",");
		
		StringJoiner sj = new StringJoiner("*", "[", "]");
		
		
		for(String c : carnivore) {
			sj.add(c);
		}
		
		System.out.println(sj);
		
	}

}
