package inheritance;

public class DeckTest_repeat1 {

	public static void main(String[] args) {

		Deck1 deck = new Deck1 ();
		
		Card1 card = deck.pick(); 
		System.out.println(card);
		
		deck.shuffle();
		
		card = deck.pick();
		
		System.out.println(card);

	


	}

}


class Deck1 {

	static final int CARD_NUM = 52;

	Card1[] cards = new Card1[CARD_NUM];

	int k = 0;
	Deck1(){
		for(int i = Card.KIND_MAX ; i > 0  ; i--) {
			for (int j = 1 ; j < Card1.NUM_MAX+1 ; j ++) {
				cards[k++] =  new Card1(i, j);
			}
		}
	}

	Card1 pick(int index) {
		return cards[index];
	}

	Card1 pick () {
		int index = (int)(Math.random()*10);
		return pick(index);
	}
	
	void shuffle () {
		for (int i = 0 ; i < cards.length ; i++  ) {
			int r = (int)(Math.random()*CARD_NUM);
			Card1 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	


	
}

class Card1 {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	int kind;
	int num;

	Card1 (){
		this(SPADE, 1);
	}

	Card1(int kind, int num){
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		String[] kinds = {"", "CLOVER","HEART","DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return " [ " + kinds[kind] + " , " + numbers.charAt(num) + " ] ";
	}





}