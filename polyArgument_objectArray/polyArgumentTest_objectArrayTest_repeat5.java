package polyArgument_objectArray;

class S_Product{
	int price ; 
	int bonusPoint ;
	
	S_Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
}

class S_TV extends S_Product{
	
	S_TV(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}

class S_Computer extends S_Product{
	
	S_Computer(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}

class S_Buyer{
	int money = 10000;
	int bonusPoint = 0 ; 
	
	S_Product[] cart = new S_Product[3];
	
	int i = 0 ; 
	void buy(S_Product p) {
		if (money < p.price)
			System.out.println("your balance is insufficient.");
		else 
			System.out.println("you have bought" + p);
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;
			
	}
	
	void summary() {
		
		int totalCost = 0 ; 
		String itemList = "";
		
		for(int i = 0 ; i < cart.length ; i++) {
			if(cart[i] ==null) 
				break;
			else 		
				totalCost += cart[i].price;
				itemList += cart[i] + ",";
				
		}
		
		System.out.println(" All you purchases are " + itemList);
		System.out.println(" Total cost is " + totalCost);

	}
}

public class polyArgumentTest_objectArrayTest_repeat5 {

	public static void main(String[] args) {
		S_Buyer bina = new S_Buyer();
		bina.buy(new S_TV(3000));
		bina.buy(new S_Computer(3000));

		
		bina.summary();


	}

}
