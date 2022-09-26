package java_repeat;

class CardGame_repeat2 {

	public static void main(String[] args) {
		
		Deck2 deck = new Deck2();
		
		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));
	}

}

class Deck2{
	
	static final int CARD_NUM = 52;
	
	Card2[] cards = new Card2[CARD_NUM];

	Deck2(){
		
		int i = 0 ; 
		
		for(int k = Card2.KIND_MAX ; k > 0 ; k--) {
			for(int n = 0 ; n < Card2.NUM_MAX ; n++) {
				cards[i++] = new Card2(n+1, k);
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
		for (int i = 0 ; i < CARD_NUM ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card2 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	
}

class Card2{
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 1;
	static final int DIAMOND = 1;
	static final int HEART = 1;
	static final int CLOVER = 1;
	
	int number ; 
	int kind ; 
	
	Card2(){
		this(1, SPADE);
	}
	
	Card2(int number, int kind){
		this.number = number;
		this.kind = kind;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return "[" + numbers.charAt(this.number) + "," + kinds[this.kind] + "]";
	}
	
	
	

	
}
