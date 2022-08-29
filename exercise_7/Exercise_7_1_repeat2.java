package exercise_7;

public class Exercise_7_1_repeat2 {

	public static void main(String[] args) {
		Deck2 deck = new Deck2();
		for (int i = 0 ; i < deck.cards.length ; i++ ) {
			System.out.println(deck.cards[i] );
		}

	}

}


class Deck2 {
	final int CARD_NUM = 20 ; 
	Card2[] cards = new Card2[CARD_NUM];

	Deck2 (){
		for (int i = 0 ; i < CARD_NUM ; i++){
			int num = i % 10 + 1 ; 
			boolean isJoker = (i < 10) && (num == 1|| num == 3 || num == 8 ? true : false);
			cards[i] =  new Card2(num, isJoker);
		}


	}


}


class Card2 {

	int num ;
	boolean isJoker;

	Card2 (){
		this(1, true);
	}

	Card2 (int num, boolean isJoker){
		this.num = num ; 
		this.isJoker = isJoker;
	}

	
	public String toString() {
		return num + (isJoker ? "K" : "");
	}



}