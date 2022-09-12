package polyArgument_objectArray;

public class polyArgumentTest_objectArrayTest_repeat6 {

	public static void main(String[] args) {
		L_Computer lc = new L_Computer(3000);
		L_Tv lt = new L_Tv(4000);
		
		
		Buyer_test bina = new Buyer_test();

		bina.buy(lt);
		bina.buy(lc);
		
		bina.summary();
		
	}

}


class L_Product{

	int price ;
	int bonusPoint ; 

	L_Product (int price){
		this.price = price;
		this.bonusPoint = (int)(price/10);
	}


}

class L_Tv extends L_Product{

	L_Tv(int price){
		super(price);
	}

	public String toString() {
		return "Tv";
	}
}

class L_Computer extends L_Product{

	L_Computer(int price){
		super(price);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer_test {

	int money = 20000;
	int bonusPoint = 0 ;

	L_Product[] cart = new L_Product[2];
	
	
	int i = 0 ; 
	void buy (L_Product p) {
		if (money < p.price) {
			System.out.println("insufficient money.");
		} else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[i++] = p;

		}
	}
	
	void summary() {
		int totalCost = 0 ; 
		String itemList = "";
		
		for(int i = 0 ; i < cart.length ; i++) {
			if(cart[i] == null) {
				break;
			} else {
				totalCost += cart[i].price;
				itemList += cart[i] + ",";
			}
			
		
		}
		
		System.out.println(" All you purchases are " + itemList);
		System.out.println(" Total cost is " + totalCost);
	}
		
}





















