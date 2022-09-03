package inheritance;

public class productTest {

	public static void main(String[] args) {
		Tv t = new Tv();

	}

}

class Product {
	int price ;
	int bonusPoint;
	
	Product(){}
	
	Product(int price){
		this.bonusPoint = (int)(price/10);
		this.price = price;
	}
}

class Tv extends Product {
	
	Tv(){}
	
	
	public String toString() {
		return "tv";
	}
}