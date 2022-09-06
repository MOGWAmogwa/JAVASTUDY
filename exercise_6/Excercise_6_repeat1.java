package exercise_6;

public class Excercise_6_repeat1 {

	public static void main(String[] args) {
		SutdaCard2 card1 = new SutdaCard2(3, false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info());
		System.out.println(card2.info());


	}

}

class SutdaCard2{
	
	int num;
	boolean isKwang;
		
	SutdaCard2(){
		this(1, true);
	}
	SutdaCard2(int num , boolean isKwang){
		this.num = num;
		this.isKwang =isKwang;
	}
	
	public String info() {
		return num + (isKwang ? "K" : "");
	}
}
