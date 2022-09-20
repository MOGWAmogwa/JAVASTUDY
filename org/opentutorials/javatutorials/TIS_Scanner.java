package TIS_JAVA_STUDY;
import java.util.*;

public class TIS_Scanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("name : ");
		String name = scanner.next();
		
		System.out.println("city : ");
		String city = scanner.next();
		
		System.out.println("age : ");
		int age = scanner.nextInt();
		
		System.out.println("weight : ");
		double weight = scanner.nextDouble();
		
		System.out.println("isSignle : ");
		boolean isSingle = scanner.nextBoolean();


	}

}
