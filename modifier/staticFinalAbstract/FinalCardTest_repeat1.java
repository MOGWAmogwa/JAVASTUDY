package modifier.staticFinalAbstract;


class Card1 {
	final int NUMBER ;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card1(){
		KIND = "Spade";
		NUMBER = 1;
	}
	Card1 (String kind , int number) {
		KIND = kind;
		NUMBER = number;
	}

	public String toString() {
		return KIND + NUMBER;
	}
}
public class FinalCardTest_repeat1 {

	public static void main(String[] args) {
		Card1 c = new Card1("Heart", 4);

		System.out.println(c);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);

//		c.KIND = "clover";
//		
//		System.out.println(c.KIND);
//		
// final 제어자 붙이면 변경 불가 



	}

}
