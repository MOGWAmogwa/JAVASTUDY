package string;
import java.util.*;
public class stringSplit_repeat4 {

	public static void main(String[] args) {
		String str = "deer,bird,rabbit";
		String[] herbivores = str.split(",");
		
		StringJoiner sj = new StringJoiner("-", "[", "]");
		
		for (String h : herbivores )
			sj.add(h);
			

		System.out.println(sj);
	}

}
