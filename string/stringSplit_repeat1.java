package string;
import java.util.StringJoiner;

public class stringSplit_repeat1 {

	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		String[] arrs = animals.split(",");
		
		System.out.println(String.join(" ", arrs));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		for(String arr : arrs)
			sj.add(arr);
		
		System.out.println(sj.toString());

	}

}
