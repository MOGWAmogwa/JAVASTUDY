package inheritance;

public class DeckTest_repeat2 {

	public static void main(String[] args) {
		Deck2 deck = new Deck2();
		Card2 card1 = deck.pick();

		System.out.println(card1);
		
		deck.shuffle();
		
		card1 = deck.pick();
		System.out.println(card1);
		
	}

}


class Deck2 extends Card2 {

	final static int CARD_NUM = 52;

	Card2[] cards = new Card2[CARD_NUM];
	int k = 0 ; 

	Deck2 (){

		for(int i = KIND_MAX ; i > 0 ; i--) {
			for(int j = 0 ; j < NUM_MAX ; j++) {
				cards[k++] = new Card2(i, j+1);
			}
		}
	}
	
	Card2 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card2 pick(int index) {
		return cards[index];
		}
	
	void shuffle() {
		for(int i = 0 ; i < cards.length ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card2 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
			
		
		}
	}
	
	
}

class Card2 {
	final static int KIND_MAX = 4;
	final static int NUM_MAX = 13;

	final static int SPADE = 1;
	final static int DIAMOND = 2;
	final static int HEART =3;
	final static int CLOVER =4;

	int kind ;
	int num ; 

	Card2 (){
		this(SPADE, 1);
	}
	Card2 (int kind, int num){
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return " [ " + kinds[kind] + " , " + numbers.charAt(num) + " ] ";
	}




}