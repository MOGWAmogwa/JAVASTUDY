package string;
import java.util.*;

public class stringSplit_repeat5 {

	public static void main(String[] args) {
		String str = "lion,tiger,bear,eagle,whale";
		String[] carnivore = str.split(",");
		
		StringJoiner sj = new StringJoiner("*", "\"", "\"" );
		
		for(String item : carnivore)
			sj.add(item);
		
		
		System.out.println(sj);
	}

}
