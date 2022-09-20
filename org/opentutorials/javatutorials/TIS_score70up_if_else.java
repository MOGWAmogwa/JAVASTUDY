package TIS_JAVA_STUDY;
import java.util.*;
public class TIS_score70up_if_else {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input your score. (0~100)");
		int score = scanner.nextInt();
		
		System.out.println("input your grade.(~4)");
		int grade = scanner.nextInt();
		
		
		if (score >= 60) {
			if(grade != 4)
				System.out.println("pass");
			else if (score>=70)
				System.out.println("pass");
			else 
				System.out.println("non-pass");
			
		} else
			System.out.println("non-pass");
		
		scanner.close();
		

	}

}
