package inheritance;

public class DeckTest_repeat4 {

	public static void main(String[] args) {
		Deck4 deck = new Deck4();
		System.out.println(deck.pick(1));
		
		deck.shuffle();
		
		System.out.println(deck.pick(1));

	}

}

class Deck4 {
	
	static final int CARD_NUM = 52;
	
	Card4[] cards = new Card4[CARD_NUM];
	
	int k = 0 ; 
	Deck4(){
		for(int i = Card4.KIND_MAX ; i > 0 ; i-- ) {
			for(int j = 0 ; j < Card4.NUM_MAX ; j ++) {
				cards[k++] = new Card4( j+1, i);
			}
		}
	}
	
	Card4 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card4 pick(int index) {
		return cards[index];
	}
	
	void shuffle () {
		for (int i = 0; i < cards.length ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card4 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
			
		}
	}
}


class Card4 {
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int DIAMOND =2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int number;
	int kind;
	
	Card4(){
		this(1, SPADE);
	}
	
	Card4(int number, int kind){
		this.number = number;
		this.kind = kind ;
		
	}
	
	public String toString() {
		
		String[] kinds = {"" , "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		
		return "[" + numbers.charAt(this.number) + "," + kinds[this.kind] + "]";

				
	}
	
	
}