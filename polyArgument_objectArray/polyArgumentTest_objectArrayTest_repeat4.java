package polyArgument_objectArray;

class Product4{
	int price;
	int bonusPoint;

	Product4 (int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);

	}
}

class Tv4 extends Product4{
	Tv4(int price){
		super(price);
	}

	public String toString() {
		return "TV";
	}
}

class Computer4  extends Product4{
	Computer4 (int price){
		super(price);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer4{
	int money = 20000;
	int bonuspoint = 0 ; 
	Product4[] cart = new Product4[3];
	
	int i = 0 ;
	void buy(Product4 p) {

		if(money < p.price )
			System.out.println("balance is insufficient.");
		else 
			money -= p.price;
			bonuspoint += p.bonusPoint;
			cart[i++] = p;


		System.out.println("you have bought"+p);
	}
	
	void summary () {
		int totalCost = 0 ; 
		String itemList = "";
		
		for (int i = 0 ; i < cart.length ;  i++) {
			if (cart[i]==null) {
				break;
			} else {
				totalCost += cart[i].price;
				itemList += cart[i] + " , ";
			}
		}
		
		System.out.println(" All you purchases are " + itemList);
		System.out.println(" Total cost is " + totalCost);
	}

}

public class polyArgumentTest_objectArrayTest_repeat4 {

	public static void main(String[] args) {
		Buyer4 bina = new Buyer4();
		bina.buy(new Tv4(3000));
		bina.buy(new Tv4(3000));

		
		bina.summary();

	}

}
