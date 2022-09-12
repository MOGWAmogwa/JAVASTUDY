package exercise_7;

public class Exercise_7_1_repeat9_sutdagame {

	public static void main(String[] args) {
		Deck9 deck = new Deck9();
		for(int i = 0 ; i < Deck9.CARD_NUM ; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}

class Deck9 {
	static final int CARD_NUM  = 20; 
	
	Card9[] cards = new Card9[CARD_NUM];
	Deck9 (){
		for (int i = 0 ; i < CARD_NUM ; i ++ ) {
			int num = i % 10 +1 ; 
			boolean isJoker = (i < 10) && (num == 1 || num ==3 || num ==8);
			cards[i] = new Card9(num, isJoker);
			
		}
	}
}


class Card9{
	int number ; 
	boolean isJoker ; 
	
	Card9 (){
		this(1, true);
	}
	
	Card9 (int number, boolean isJoker){
		this.number = number;
		this.isJoker = isJoker;
	}
	
	public String toString() {
		return number + "" + (isJoker ? "K" : "");
	}
	
}