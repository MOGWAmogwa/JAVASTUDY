package inheritance;

public class DeckTest_repeat5 {
	public static void main(String[] args) {
		Deck5 deck = new Deck5();
		

		
		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));

	}
}

class Deck5 {
	
	static final int CARD_NUM = 52;
	
	Card5[] cards = new Card5[CARD_NUM];
	
	int i = 0 ; 
	
	Deck5(){
		
		for(int k = Card5.KIND_MAX ; k > 0 ; k--)
			for(int n = 0 ; n < Card.NUM_MAX ; n++)
				cards[i++] = new Card5(n+1 , k);
	}
	
	Card5 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card5 pick(int index) {
		return cards[index];
	}
	
	void shuffle() {

		for(int i = 0 ; i < cards.length ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card5 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	
	
		
	}
	
	
	
	
}


class Card5 {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int DIAMOND = 2; 
	static final int HEART = 3; 
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	Card5(){
		this(1,SPADE);
	}
	
	Card5 (int number, int kind){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds  = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		
		return "[" + numbers.charAt(number) + "," + kinds[this.kind] + "]";
	}
	
	
	
}