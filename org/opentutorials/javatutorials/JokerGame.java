package TIS_JAVA_STUDY;

public class JokerGame {

	public static void main(String[] args) {
		Deck_ deck = new Deck_();
		for(int i = 0 ; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}

class Deck_{
	static final int CARD_NUM = 20;
	
	Card_[] cards = new Card_[CARD_NUM];
	
	Deck_(){
		for(int i = 0 ; i < CARD_NUM ;  i++) {
			int number = i % 10 + 1;
			boolean isJoker = (i < 10) && (number==1||number==3||number==8);
			cards[i] = new Card_(number, isJoker);
		}
	}
}

class Card_{
	
	int number;
	boolean isJoker;
	
	Card_(){
		this(1, true);
	}
	
	Card_(int number, boolean isJoker){
		this.number = number;
		this.isJoker = isJoker;
	}
	
	public String toString() {
		
		return this.number + "" + (isJoker ? "K" : "");
				
	}
	
}
