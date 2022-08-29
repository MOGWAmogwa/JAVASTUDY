package exercise_7;

public class Exercise_7_1_repeat1 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		for(int i = 0 ; i < deck.cards.length; i++)
			System.out.println(deck.cards[i] + ",");

	}
}

class Deck {
	
	final int CARD_NUM = 20 ;

	Card[] cards = new Card[CARD_NUM];

	Deck() {
		for(int i = 0 ; i < CARD_NUM ; i++) {
			int num = i%10+1;
			boolean isJoker = (i<10)&&(num==1||num==3||num==8);
			cards[i] = new Card(num, isJoker);
		}
	}

}

class Card {
	int num; 
	boolean isJoker;

	Card(){
		this(1, true);
	}

	Card(int num , boolean isJoker){
		this.num = num;
		this.isJoker = isJoker;
	}
	
	public String toString() {
		return num + (isJoker ? "K" : "");
	}


}
