package TIS_JAVA_STUDY;

public class CardGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));

		


	}

}

class Deck {
	static final int CARD_NUM = 52;
	Card[] cards = new Card[CARD_NUM];
	
	int i = 0 ; 
	
	Deck(){
		for (int k = Card.KIND_MAX ; k > 0 ; k--) {
			for(int n = 0 ; n < Card.NUM_MAX ; n++) {
				cards[i++] = new Card(n+1, k );
			}
		}
	}

	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
			
	}
	
	Card pick(int index) {
		return cards[index];
			
	}
	
	
	void shuffle() {

		for (int i = 0 ; i < CARD_NUM ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
		
	}
	
}

class Card{
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int number;
	int kind;
	
	Card(){
		this(1, SPADE);
		
	}
	
	Card(int number , int kind){
		this.number = number;
		this.kind = kind;
		
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return numbers.charAt(this.number) + "," + kinds[this.kind];
		
	}
	
}
