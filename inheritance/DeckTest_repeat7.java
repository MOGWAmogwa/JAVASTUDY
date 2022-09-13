package inheritance;

public class DeckTest_repeat7 {

	public static void main(String[] args) {
		Deck_ deck = new Deck_();
		
		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));

	}

}

class Deck_{
	static final int CARD_NUM = 52;
	Card_[] cards = new Card_[CARD_NUM];

	Deck_() {

		int i = 0 ; 
		for(int k = Card_.KIND_MAX ; k > 0 ; k--) {
			for(int n = 0 ; n < Card_.NUM_MAX ; n++) {
				cards[i++] = new Card_(n+1, k);
			}
		}

	}
	
	Card_ pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card_ pick(int index) {
		return cards[index];
	}
	
	void shuffle() {
		int r = (int)(Math.random()*CARD_NUM);
		for (int i = 0 ; i < CARD_NUM ; i++) {
			Card_ temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}

}


class Card_{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	int number;
	int kind;

	Card_(){
		this(1, SPADE);
	}

	Card_(int number, int kind){
		this.number = number;
		this.kind = kind;
	}

	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return "[" + numbers.charAt(this.number) + "," + kinds[this.kind] + "]";
	}


}