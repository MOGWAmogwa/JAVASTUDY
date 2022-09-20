package TIS_JAVA_STUDY;
import java.util.*;
public class PolyArgumentsTest_repeat1 {

	public static void main(String[] args) {
		Buyer_ bina = new Buyer_();
		bina.buy(new Tv_(2000));
		bina.buy(new Radio_(2000));
		bina.buy(new Computer_(2000));
		bina.summary();
		

	}

}

class Product_ {
	
	int price;
	int bonusPoint;
	
	Product_(int price){
		this.price = price;
		this.bonusPoint = price/10;
	}
	
	
}

class Tv_ extends Product_ {
	
	Tv_(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
	
}


class Radio_ extends Product_ {
	
	Radio_(int price){
		super(price);
	}
	
	public String toString() {
		return "Radio";
	}
	
}

class Computer_ extends Product_ {
	
	Computer_(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
	
}


class Buyer_{
	int money = 100000 ; 
	int bonusPoint = 0 ; 
	ArrayList carts = new ArrayList();
	
	
	void buy(Product_ p) {
		if(money < p.price)
			System.out.println("insufficient balance");
		else 
			money -= p.price;
			bonusPoint += p.bonusPoint;
			carts.add(p);

	}
	
	void refund(Product_ p) {
		if(carts.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("product is refunded");
		} else {
			System.out.println("no item in your cart.");
		}
	}
	
	void summary() {
		int totalCost = 0 ; 
		String itemList = "";
		
		if (carts.isEmpty()) {
			return;
		}
		
		for (int i = 0 ; i < carts.size(); i++) {
			Product_ p = (Product_)carts.get(i);
			totalCost += p.price;
			itemList += (i==0) ? " " + p  : ", " + p ; 
		}
		

		
		System.out.println("total cost : " + totalCost);
		System.out.println("list : " + itemList);

		

	}
	
	
	
	
	
}












