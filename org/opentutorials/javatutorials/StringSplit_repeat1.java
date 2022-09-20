package TIS_JAVA_STUDY;
import java.util.*;

public class StringSplit_repeat1 {

	public static void main(String[] args) {
		String animals = "rabbit,deer,bird";
		String[] harbivore = animals.split(",");
		StringJoiner sj = new StringJoiner(" - ", "\"", "\"");
		
		for(String animal : harbivore) {
			sj.add(animal);
		}
		
		System.out.println(sj);
		
		

	}

}
