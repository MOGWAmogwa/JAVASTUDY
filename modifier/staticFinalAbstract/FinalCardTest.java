package modifier.staticFinalAbstract;


class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int number){
		KIND = kind;
		NUMBER = number;
	}
	Card(){
		this("Heart", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("Spade", 10);
		
		System.out.println(c.KIND);
//		c.KIND = "Diamond"; //The final field Card.KIND cannot be assigned
		
		// static 은 값 변경 가능 ! final 은 값 변경 불가능 ! 
		
	}

}
