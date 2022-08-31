package exercise_7;

public class Exercise_7_1_repeat5 {

	public static void main(String[] args) {
		Deck5 deck = new Deck5();
		
		for(int i = 0 ; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}


class Deck5 {

	final int CARD_NUM = 20;

	Card5[] cards = new Card5[CARD_NUM];

	Deck5(){

		for(int i = 0 ; i < CARD_NUM ; i++) {
			int num = i%10+1;
			boolean isJoker = (i<10)&&(num==1||num==3||num==8);
			cards[i] = new Card5(num, isJoker);
		}
	}
}

class Card5 {
	int num ; 
	boolean isJoker ; 

	Card5() {
		this(1, true);
	}


	Card5(int num, boolean isJoker){
		this.num = num; 
		this.isJoker = isJoker;
	}

	public String toString() {
		return num + (isJoker ? "K" : "");
	}




}





