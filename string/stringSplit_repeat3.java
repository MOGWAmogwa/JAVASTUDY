package string;
import java.util.*;
public class stringSplit_repeat3 {

	public static void main(String[] args) {
		String str = "dog,cat,bear";
		String[] animals = str.split(",");
		
		StringJoiner sj = new StringJoiner("-", "[", "]");

		for(String animal : animals) {
			sj.add(animal);
		}
		
		System.out.println(sj);
	}
}
