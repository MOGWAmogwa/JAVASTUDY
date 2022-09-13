package exercise_7;

public class Exercise_7_1_repeat10_sutdagame {

	public static void main(String[] args) {
		Deck_ deck = new Deck_();
		
		for(int i = 0 ; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}
	}

}

class Deck_ {
	
	static final int CARD_NUM = 20;
	Card_[] cards = new Card_[CARD_NUM];
	Deck_(){
		for(int i = 0 ; i < CARD_NUM ;  i++) {
			int number = i % 10 + 1 ;
			boolean isKwang = (i < 10) && (number == 1 || number == 3 || number == 8 );
			cards[i] = new Card_(number, isKwang);
		}

		
	}
}


class Card_{
	int number;
	boolean isKwang;
	
	Card_(int number, boolean isKwang){
		this.number = number;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return number + "" + (isKwang ? "K" : "" ) ;
	}
	
}