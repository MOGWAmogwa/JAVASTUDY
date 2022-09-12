package inheritance;

public class DeckTest_repeat6 {

	public static void main(String[] args) {

		Deck9 deck = new Deck9();
		
		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));
		
		

	}

}

class Deck9 {
	static final int CARD_NUM = 52;

	Card9[] cards = new Card9[CARD_NUM];

	int i = 0 ; 

	Deck9 (){
		for (int k = Card9.KIND_MAX ; k > 0 ; k-- ) {
			for (int n = 0 ; n < Card9.NUM_MAX ; n++ ) {
				cards[i++] =  new Card9(n+1, k);
			}
		}
	}
	
	
	Card9 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card9 pick(int index) {
		return cards[index];
	}
	
	void shuffle() {
		int r = (int)(Math.random()*CARD_NUM);
		for(int i = 0 ; i < cards.length; i ++) {
			Card9 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
			
		}
	}



}


class Card9 {

	static final int KIND_MAX = 4; 
	static final int NUM_MAX = 13;

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	int number; 

	int kind;

	Card9 (){
		this(1, SPADE);
	}

	Card9 (int number, int kind){
		this.number = number;
		this.kind = kind;
	}


	public String toString() {
		String numbers = "0123456789XJQK";
		String[] kinds = {"", "CLOVER" , "HEART" , "DIAMOND", "SPADE"};
		return "[" + numbers.charAt(this.number)+ "," + kinds[this.kind]+ "]"; 
	}



}