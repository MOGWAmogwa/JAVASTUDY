package cafe.java.objectOrientedProgramming;

public class CardTest_repeat1 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 10;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;
		
		
		System.out.println("c1 kind");
		System.out.println(c1.kind);
		System.out.println("c1 number");
		System.out.println(c1.number);
		System.out.println("c1 width + height");
		System.out.println(c1.width + "," + c1.height);
		System.out.println("c2 kind");
		System.out.println(c2.kind);
		System.out.println("c2 number");
		System.out.println(c2.number);
		System.out.println("c2 width + height");
		System.out.println(c2.width + "," + c2.height);
		
		// 넓이와 높이 바꾸기 
		
//		c1.width = 80;
//		c1.height = 100; // 이렇게 적으면 오해의 소지가 있기 때문에 
		
		Card.width = 80;
		Card.height = 100; // 이렇게 적는 것이 Good!
		
		// 변경된 값 출력
		
		System.out.println("c1 width + height");
		System.out.println(c1.width + "," + c1.height);
		
		System.out.println("c2 width + height");
		System.out.println(c2.width + "," + c2.height);
		
		

	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
