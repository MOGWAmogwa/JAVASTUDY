package jungsuk_coding;

public class Practice4_11 {

	public static void main(String[] args) {

		// 피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 
		// 1,1,2,3,5,8,13,21 ... 과 같은 식으로 진행된다 . 
		// 1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오. 
		
		// 2시 5분까지 풀고 안풀리면 넘어가 
		
		int num1 = 1; 
		int num2 = 1; 
		int num3 = 0; // 세 번째 값
		
		// 1,1,2,3,5,8,13,21,34,55
		
		System.out.print(num1 + "," + num2);
		
		int temp = 0 ; 
		
		for(int i = 0 ; i < 8 ; i ++) {
			num3 = num1 + num2;
			temp = num3 ; 
			num1 = num2 ; 
			num2 = num3 ; 
			num3 = temp;
			
			
			System.out.print("," + temp);
	
			
		}
		
		
		

	} // end of main 

} // end of class



// num4 = num2 + num3 가 되어야 함 
// num5 = num3 + num4 가 되어야 함  // 잘 생각해보면.. num2 , num3 이 아이들은 이미 기존에 있는 값들을 다시 대입하는 거고 값이 다이나믹하게 바뀌는 애는 num4 , num5 같은 애들임
// num6 = num4 + num5


// num3 = num1 + num2
// num4 = num2 +    num1 + num2 다시 풀어서 써보면 이런느낌
// num5 = num1 + num2      +  num2 + num1 + num2
// num6 = num2 + (num1 + num2)   +    (num1 + num2) + (num2 + (num1 + num2)) // 이건 아닌 거 같고 

