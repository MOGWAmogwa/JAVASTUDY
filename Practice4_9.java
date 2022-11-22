package jungsuk_coding;

public class Practice4_9 {

	public static void main(String[] args) {
		
		
		// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결괄르 출력하는 코드를 완성하라 만일 문자열이 "12345"라면 '1+2+3+4+5' 연산 결과 출력
		// Hint String 클래스의 charAt 사용 
		
		
		String str = "12345"; // 얘를 반복문으로 charAt(i)을 써서 하나하나씩 빼온다음에 sum에 더해줄거임
		int sum = 0 ; 
		

		for(int i = 0 ; i < str.length() ; i++) {
			
			// System.out.println(str.charAt(i)); // 1 2 3 4 5
			
			// 근데 그냥 chartAt(i) 로 하면 1 2 3 4 5 가 나오는데 sum 이 0 숫자형이라서 연산을 해버리면 49 50 이렇게 문자코드(?) 가 나오심.. 그래서 이걸 바꿔줘야함
			
			sum = sum + (str.charAt(i)-'0'); // 요로코롬 바꿔주겠음
		
		}
		System.out.println(sum); // 잘나옴~~
	
	}

}
