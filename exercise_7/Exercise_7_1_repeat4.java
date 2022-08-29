package exercise_7;

public class Exercise_7_1_repeat4 {

	public static void main(String[] args) {
		SutdaDeck_1 deck = new SutdaDeck_1();
		for (int i = 0 ; i < deck.cards.length ; i++ ) {
			System.out.println(deck.cards[i] );
		}

	}

}

class SutdaDeck_1 {

	final int CARD_NUM = 20; 

	SutdaCard_1[] cards = new SutdaCard_1[CARD_NUM];

	SutdaDeck_1(){
		for(int i = 0 ; i < cards.length ; i++) {
			int num = i%10+1;
			boolean isJoker = (i<10) && (num==1||num==3||num==8 ?  true : false);
			cards[i] = new SutdaCard_1(num, isJoker);
		}
	}

}


class SutdaCard_1{

	int num ; 
	boolean isJoker;

	SutdaCard_1(){
		this(1, true);
	}

	SutdaCard_1(int num, boolean isJoker){
		this.num = num; 
		this.isJoker = isJoker;
	}

	public String toString() {
		return num + (isJoker ? "K" : "");
	}
}