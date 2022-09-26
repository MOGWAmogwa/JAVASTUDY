package java_repeat;
import java.util.*;

public class PolyArgumentsTest {

	public static void main(String[] args) {
		
		Buyer bina = new Buyer();
		
		bina.buy(new Tv(2000));
		bina.summary();

	}

}


class Product {
	int price ; 
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint += (int)price/10;
		
	}
	
	public String toString(Product p) {
		return p + "";
	}
	
	
}

class Tv extends Product{
	Tv(int price){
		super(price);	
	}
	
	public String toString() {
		return "TV";
	}
}


class Radio extends Product{
	Radio(int price){
		super(price);	
	}
	
	public String toString() {
		return "Radio";
	}
}



class Buyer{
	int money = 20000 ; 
	int bonusPoint = 0 ; 
	ArrayList carts = new ArrayList();
	
	void buy (Product p) {
		if(money < p.price) 
			System.out.println("insufficient balance");
		else 
			money -= p.price;
			bonusPoint += p.bonusPoint;
			carts.add(p);
			System.out.println("you bought " + p);
		
	}
	
	void refund(Product p) {
		if(carts.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("you have refunded " + p);
		} else {
			System.out.println("no item in your cart");
		}
	}
	
	void summary() {
		int sum = 0 ; 
		String itemList = "";
		
		if(carts.isEmpty()) { // 문자열 길이가 0 인 경우  true false 값 리턴
			System.out.println("you've not bought yet.");
			return;
		}
		
		for (int i = 0 ; i < carts.size() ; i++) {
			Product p = (Product)carts.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p ;
			
		}
		
		System.out.println("total cost : " + sum);
		System.out.println("list : " + itemList);

	}

}

