package exercise_7;

public class Exercise_7_1_repeat11_sutdagame {

	public static void main(String[] args) {

		_Deck deck = new _Deck();
		
		for (int i = 0 ; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}
	}

}

class _Deck{
	
	static final int CARD_NUM = 20 ; 
	
	_Card[] cards = new _Card[CARD_NUM];
	_Deck(){
		for(int i = 0 ; i < CARD_NUM ; i++) {
			int number = i % 10 + 1 ; 
			boolean isJoker = (i < 10) && (number ==1 || number ==3 || number==8);
			cards[i] = new _Card(number, isJoker);
		}
	}
}


class _Card {
	int number ; 
	boolean isJoker ; 

	_Card(int number, boolean isJoker){
		this.number = number; 
		this.isJoker = isJoker;
	}
	
	public String toString() {
		
		return number + "" + (isJoker ? "k" : "" );
		
		
	}



}