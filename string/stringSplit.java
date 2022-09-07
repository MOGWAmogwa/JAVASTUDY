package string;
import java.util.StringJoiner;




class stringSplit {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String newAnimal = String.join("-", arr);
		System.out.println(newAnimal);

//		System.out.println(String.join("-", arr));

		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}