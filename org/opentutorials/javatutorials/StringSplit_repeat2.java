package java_repeat;
import java.util.*;

public class StringSplit_repeat2 {

	public static void main(String[] args) {
		
		String[] animals = {"tiger", "lion", "wolf", "bear"};
		
		StringJoiner sj = new StringJoiner("-", "[", "]");
		
		for (String carnivore : animals) {
			sj.add(carnivore);
		}
		
		System.out.println(sj);
				

	}

}
