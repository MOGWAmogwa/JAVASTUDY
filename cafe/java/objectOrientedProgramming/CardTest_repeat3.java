package cafe.java.objectOrientedProgramming;

public class CardTest_repeat3 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 5;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 8;
		
		System.out.printf("c1's kind = %s / c1's number = %d / c1 (%d, %d)%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2's kind = %s / c2's number = %d / c2 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		
		System.out.println("static int change");
		
		Card.width = 80; // static 변수의 경우 객체를 생성하지 않아도 변경이 가능하다 
		Card.height = 100;
		
		System.out.printf("c1's kind = %s / c1's number = %d / c1 (%d, %d)%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2's kind = %s / c2's number = %d / c2 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		

		

	}

}


class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 140;
}