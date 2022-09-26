package java_repeat;

public class JokerGame_repeat1 {

	public static void main(String[] args) {
		Deck_j deck = new Deck_j();
		
		for(int i = 0 ; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}


class Deck_j{
	
	static final int CARD_NUM = 20;
	
	Card_j[] cards = new Card_j[CARD_NUM];
	
	Deck_j() {
		for(int i = 0 ; i < CARD_NUM ; i++) {
			int number = i % 10 + 1;
			boolean isJoker = (i < 10 ) && (number == 1 || number == 3 || number == 8 );
			cards[i] = new Card_j(number, isJoker);
		}
			
	}
	
	
}

class Card_j{
	int number;
	boolean isJoker;
	
	Card_j(){
		this(1, true);
	}
	
	Card_j(int number, boolean isJoker){
		this.number = number;
		this.isJoker = isJoker;
	}
	
	public String toString() {
		return this.number + (this.isJoker ? "K" : "");
	}
}