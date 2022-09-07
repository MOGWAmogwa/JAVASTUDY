package string;

import java.util.StringJoiner;

public class stringSplit_repeat2 {

	public static void main(String[] args) {
		String[] animals = {"rabbit", "mouse", "deer"};
		
		StringJoiner sj = new StringJoiner("-", "[", "]");
		
		for(String animal : animals) {
			sj.add(animal);
		}
		
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner("-");
		
		for(String animal : animals) {
			sj2.add(animal);
		}
		
		System.out.println(sj2);
		
		String[] arr = sj.toString().split("-");
		
		System.out.println(arr);
		

			

	}

}
