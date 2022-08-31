package polyArgument_objectArray;

public class polyArgumentTest_objectArrayTest_repeat3 {

	public static void main(String[] args) {
		System.out.println(new Tv(3000).price);

	}

}


class Product3 {
	int price ; 
	int bonusPoint ; 
	
	Product3(int price){
		bonusPoint = (int)(price/10);
		this.price = price;
	}
	
}

class Tv3 extends Product3 {
	Tv3(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
				
	}
}

class Computer3 extends Product3 {
	Computer3(int price){
		super(price);
	}
	
	public String toString() {
		return "COMPUTER";
				
	}
}

