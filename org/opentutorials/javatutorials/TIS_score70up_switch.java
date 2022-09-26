package TIS_JAVA_STUDY;
import java.util.*;

public class TIS_score70up_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char grade;

		System.out.println("input your score");
		int score = scanner.nextInt();

		switch (score / 10) {
		case 10:
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default:
			grade = 'F';

		}
		
		System.out.println("your gpa is :" + grade);
		
		scanner.close();
	}

}
