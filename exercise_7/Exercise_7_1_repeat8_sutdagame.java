package exercise_7;

public class Exercise_7_1_repeat8_sutdagame {

	public static void main(String[] args) {
		Deck8 deck = new Deck8();
		for (int i = 0 ; i < deck.cards.length ;  i ++)
			System.out.println(deck.cards[i]);

	}

}

class Deck8 {
	static final int CARD_NUM = 20;
	
	Card8[] cards = new Card8[CARD_NUM];

	Deck8() {
		for(int i = 0 ; i < cards.length ; i++ ) {
			int number = i % 10 + 1;
			boolean isJoker = (i < 10) && (number==1||number==3||number==8);
			
			cards[i] = new Card8(number, isJoker);
		}
	}

	
	
}


class Card8{
	
	int number; 
	boolean isJoker;
	
	Card8(){
		this(1, true);
	}
	
	Card8(int number, boolean isJoker){
		this.number = number;
		this.isJoker = isJoker;
	}
	
	public String toString() {
		return this.number+  "" + (isJoker ? "K" : "") ; 
	}
}