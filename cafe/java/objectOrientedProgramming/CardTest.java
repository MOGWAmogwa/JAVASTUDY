package cafe.java.objectOrientedProgramming;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " +  Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1's kind : " + c1.kind + " c1's number : " + c1.number + " c1's width & height : " + "(" + c1.width + "," + c1.height + ")");
		
		System.out.println("c2's kind : " + c2.kind + " c2's number : " + c2.number + " c2's width & height : " + "(" + c2.width + "," + c2.height + ")");
		
		// 클래스 변수 값 변경
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1's width & height : " + "(" + c1.width + "," + c1.height + ")");
		System.out.println("c2's width & height : " + "(" + c2.width + "," + c2.height + ")");
		
		
	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}