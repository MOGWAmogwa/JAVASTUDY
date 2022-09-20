package TIS_JAVA_STUDY;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// 456 을 입력받으면 400 이 되도록 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input : ");
//		
//		int number = sc.nextInt();
//		
//		int hundred = number/100;
//		
//		System.out.println(hundred*100);
//		

		
		// 333을 입력 받으면 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input : ");
//		
//		
//		int number = sc.nextInt();
//		
//		System.out.println(number-(number%10)+1);
//		
		
		// 10의 배수 구하기 
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input : ");
//		
//		
//		int number = sc.nextInt();
//		System.out.println((number/10+1)*10); //1번
//		
//		System.out.println((number/10+1)*10 - number); //2번
//		
		
		// 사과의 개수를 입력 
		// 한 바구니에 10개의 사과를 담을 수 있다. 
		// 몇개의 바구니가 필요할까
		
		// 36개 4개
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input : ");
//		
//		
//		int number = sc.nextInt();
//		
//		System.out.println(number/10+1 );
//	
		
		
		
		// Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라 평균값을 구하는 것이 아님에 주의하라.
		
		// 20 100 33
		// 중간값 33
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x :");
		int x = scanner.nextInt();
		System.out.println("y :");
		int y = scanner.nextInt();
		System.out.println("z :");
		int z = scanner.nextInt();
		
		if (Math.abs(x-y) + Math.abs(y-z) == Math.abs(z-x)) {
			System.out.println(y);
		} else if (Math.abs(x-z) + Math.abs(z-y) == Math.abs(y-x)) {
			System.out.println(z);
		} else {
			System.out.println(x);
		}
		
		
		// Scanner를 이용하여 삼각형 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
		
		/* 정수 3개를 입력하시오  4 3 5
		 * 
		 * 삼각형이 됩니다. */
		
		// x > (y-z) && x < (y+z)
		

		

		
		

	
			
		
		
	}

}










