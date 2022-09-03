package exercise_7;

public class Excercise_7_1_repeat6_sutdagame {

	public static void main(String[] args) {
		Deck6 deck = new Deck6();
		for(int i = 0; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}


class Deck6{
	
	static final int CARD_NUM = 20;	
	
	Card6[] cards = new Card6[CARD_NUM];
	
	Deck6(){
		for (int i = 0 ; i < CARD_NUM ;  i++) {
			int number = i%10+1;
			boolean isJoker = (i<10)&&(number==1||number==3||number==8 ? true : false);
			cards[i] = new Card6(number, isJoker);
		}
	}
}

class Card6 {
	

	int number;
	boolean isJoker ;
	
	Card6(){
		this(1,true);
	}
	
	Card6(int number, boolean isJoker){
		this.number = number;
		this.isJoker = isJoker;
			
	}
	
	public String toString() {
		return number + (isJoker ? "k" : "");
	}
	
	
	
	
}


