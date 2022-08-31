package polyArgument_objectArray;

public class polyArgumentTest_objectArrayTest_repeat2 {

	public static void main(String[] args) {
		Buyer bina = new Buyer();
		bina.buy(new Tv(3000));
		bina.summary();

	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		bonusPoint = (int)(price/10);
		this.price = price;
		
	}
	
	
}

class Tv extends Product {
	Tv(int price ){
		super(price);
	}
	
	public String toString() {
		return "TV";
		
	}
}


class Computer extends Product {
	Computer(int price ){
		super(price);
	}
	
	public String toString() {
		return "COMPUTER";
		
	}
}


class Buyer{
	int money = 10000;
	int bonusPoint = 0 ; 
	
	Product[] cart = new Product[3];
	
	int i = 0 ;
	void buy (Product p) {
		if(p.price > money) {
			System.out.println("insufficient balance");
		} else {
			money -= p.price;
			bonusPoint+=p.bonusPoint;
			cart[i++] = p;
		}
		
		System.out.println("you have bought " + p);
	}
	
	void summary() {
		int totalCost = 0 ; 
		String itemList = "";
		
		for (int i = 0 ; i < cart.length ;  i++) {
			if(cart[i]==null) {
				break;
			} else {
				totalCost += cart[i].price;
				itemList += cart[i] + ",";
			}
			
		}
		
		System.out.println("All you purchases are " + itemList);
		System.out.println("Total cost is " + totalCost);
	}
	
	
	
}









