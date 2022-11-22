package jungsuk_coding;

public class Practice4_4 {

	public static void main(String[] args) {
		
		
		int i = 0 ; 
		int sum = 0 ; 
		while(sum < 100) {
			i++;
			if(i%2==0) {
				sum = sum + -i ; 
			}else {
				sum = sum + i ; 
			}
		}
		
		System.out.println(i);
		
//		
//		int oddNum = 1;
//		int evenNum = -2;
//		int count = 0 ; 
//		
//		while (count < 99) {
//			//System.out.println(oddNum);
//			oddNum = oddNum + 2;
//			
//			//System.out.println(evenNum);
//			evenNum = evenNum -2;
//			
//			//System.out.println(" oddNum + evenNum = " + (oddNum+evenNum));
//			if(oddNum+evenNum == -1) {
//				count++;
//			}
//		
//		}
//		
//		System.out.println("targetNumber = " + oddNum);
//		//System.out.println("count = " + count);
		
		

		
//		int sum = 0 ; 
//		
//		for(int i = 1 ; i <= 10; i++) {
//			
//			if(i%2==0) {
//				sum = sum + (-i);
//				System.out.println(-i);
//			
//			} else {
//				sum = sum + i;
//				System.out.println(i);
//			}
//	
//		} // for 문 끝
//		
//		System.out.println(sum);
		
	}

}
