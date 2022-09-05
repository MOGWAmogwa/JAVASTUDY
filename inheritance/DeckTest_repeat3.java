package inheritance;


public class DeckTest_repeat3 {

	public static void main(String[] args) {
		Deck3 deck = new Deck3();

		System.out.println(deck.pick(0));
		
		deck.shuffle();
		
		System.out.println(deck.pick(0));
		
		

	}

}


class Deck3 {
	
	static final int CARD_NUM = 52;
	
	Card3[] cards = new Card3[CARD_NUM];
	
	int i = 0 ;
	Deck3() {
		for (int k = Card3.KIND_MAX ; k > 0 ; k-- ) {
			for (int n = 0 ; n < Card3.NUM_MAX ; n++) {
				cards[i++] = new Card3(n+1 , k);
			}
		}
	}
	
	Card3 pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	
	Card3 pick(int index){
		return cards[index];
	}
	
	void shuffle() {
		for (int i = 0 ; i < cards.length ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card3 temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		
			
		}
	}
	
}




class Card3{
	static final int KIND_MAX = 4 ;
	static final int NUM_MAX = 13 ;
	
	static final int SPADE = 4 ;
	static final int DIAMOND = 3 ;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int number ;
	int kind ;
	
	Card3(){
		this(1, SPADE);
	}
	
	Card3 (int number, int kind){
		this.number = number;
		this.kind = kind;
	}
	

	
	public String toString() {
		String[] kinds = {"", "CLOVER" , "HEART" , "DIAMOND" , "SPADE"};
		String numbers = "0123456789XJQK";
		return "[" + numbers.charAt(number) + "," + kinds[this.kind] + "]";
	}
	
	
}
