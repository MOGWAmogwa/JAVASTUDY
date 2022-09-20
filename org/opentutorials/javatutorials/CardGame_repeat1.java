package TIS_JAVA_STUDY;

public class CardGame_repeat1 {

	public static void main(String[] args) {

		_Deck deck = new _Deck();

		System.out.println(deck.pick(0));

		deck.shuffle();


		System.out.println(deck.pick(0));


	}

}

class _Deck {
	static final int CARD_NUM = 52;

	_Card[] cards = new _Card[CARD_NUM];

	int i = 0 ; 

	_Deck(){
		for (int k = _Card.KIND_MAX ; k > 0 ; k--) {
			for (int n = 0 ; n < _Card.NUM_MAX ; n++) {
				cards[i++] = new _Card(n+1, k );
			}
		}
	}
	_Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}

	_Card pick(int index) {
		return cards[index];
	}

	void shuffle () {
		for (int i = 0 ; i < CARD_NUM ; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			_Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
}


class  _Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;


	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	int number;
	int kind;

	_Card(){
		this(1, SPADE);
	}

	_Card(int number, int kind){
		this.kind = kind;
		this.number = number;
	}

	public String toString() {

		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return numbers.charAt(this.number) + " , " + kinds[this.kind]; 
	}

}