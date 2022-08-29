package polyArgument_objectArray;

class Product1 {

	int price;
	int bonusPoint;

	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);

	}
}

class Tv1 extends Product1{

	Tv1(int price){
		super(price);
	}

	public String toString() {
		return "Tv";
	}
}


class Computer1 extends Product1{

	Computer1 (int price){
		super(price);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer1 {
	int money = 20000;
	int bonusPoint = 0;
	
	Product1[] cart = new Product1[3];
	
	int i = 0 ;
	void buy (Product1 p) {
		
		if(money < p.price) {
			System.out.println("balance is insufficient.");
			return;
		} else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;
		}
		
		System.out.println("you have bought " + p + ". and you cost " + p.price);
	}
	
	void summary () {
		int totalCost = 0 ; 
		String itemList = "";
		
		for (int i = 0 ; i < cart.length ; i++) {
			if (cart[i]==null) {
				break;
			} else {
				totalCost += cart[i].price;
				itemList += cart[i] + " , ";
			}
		}
		
		System.out.println("[1] All you purchases are " + itemList);
		System.out.println("[1] Total cost is " + totalCost);
	}



}

public class polyArgumentTest_objectArrayTest_repeat1 {

	public static void main(String[] args) {
		Buyer1 bina = new Buyer1();
		bina.buy(new Tv1(3000));
		bina.buy(new Tv1(3000));

		
		bina.summary();
		
		

	}

}
