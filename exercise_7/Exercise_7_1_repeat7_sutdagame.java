package exercise_7;

public class Exercise_7_1_repeat7_sutdagame {

	public static void main(String[] args) {
		Deck7 deck = new Deck7();
		for (int i = 0 ; i < deck.cards.length ; i++) {
			System.out.println(deck.cards[i]);
		}

	}

}


class Deck7{
	static final int CARD_NUM = 20;
	Card7[] cards = new Card7[CARD_NUM];
	
	Deck7() {
		for(int i = 0 ; i < CARD_NUM ; i++) {
			int n = i % 10 + 1;
			boolean j = (i<10) && (n ==1 || n==3||n==8); 
			cards[i] = new Card7(n, j);
		}
	}
	

	
}



class Card7{
	
	int number;
	boolean isJoker;
	
	Card7(){
		this(1, true);
	}
	
	Card7(int number, boolean isJoker){
		this.number= number;
		this.isJoker= isJoker;
	}
	
	public String toString() {
		return number + (isJoker ? "K" : "");
	}
	
	
}