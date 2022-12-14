package java_castle;

public class Exercise9_1 {

	public static void main(String[] args) {
		
		Card c1 = new Card(3, true);
		Card c2 = new Card(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
		
	}

}

class Card {
	int num;
	boolean isKwang;
	
	Card(){
		this(1, true);
	}
	
	Card(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals (Object obj) {
		
		// 매개변수로 넘겨진 객체의 num, isKwang과 멤버변수  num, isKwang 을 비교하도록 오버라이딩 하시오.
		
		if(obj instanceof Card) {
			return (this.isKwang==((Card)obj).isKwang) && (this.num==((Card)obj).num) ;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
