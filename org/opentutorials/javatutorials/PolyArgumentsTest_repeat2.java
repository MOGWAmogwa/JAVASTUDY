package java_repeat;
import java.util.*;

public class PolyArgumentsTest_repeat2 {

	public static void main(String[] args) {

		Customer bina = new Customer();
		Ipad iPad = new Ipad(2004);
		Airpod airpod = new Airpod(3903);
		Imac imac = new Imac(2040);
		
		
		bina.buy(iPad);
		bina.buy(airpod);
		bina.buy(imac);
		bina.refund(imac);
		bina.summary();
		
		System.out.println(bina.bonusPoint);
		
	}

}

class Product2 {
	int price;
	int bonusPoint; 
	
	Product2(int price){
		this.price = price;
		this.bonusPoint =(int)(price/10.0);
	}
	
	
}

class Ipad extends Product2 {
	
	Ipad(int price){
		super(price);
	}
	
	public String toString() {
		return "Ipad";
	}
	
}

class Airpod extends Product2 {
	
	Airpod(int price){
		super(price);
	}
	
	public String toString() {
		return "Airpod";
	}
	
}

class Imac extends Product2 {
	
	Imac(int price){
		super(price);
	}
	
	public String toString() {
		return "Imac";
	}
	
}

class Customer{
	
	int money = 20000;
	int bonusPoint = 0;
	ArrayList cart = new ArrayList();
	
	void buy(Product2 p) {
		if(money < p.price)
			System.out.println("invalid balance");
		else 
			System.out.println("you've bought " + p);
			this.money -= p.price;
			this.bonusPoint += p.bonusPoint;
			cart.add(p);		
	}
	
	
	void refund(Product2 p) { // 객체주소라서 이름이 같아도 알아서 구별
		if(!cart.remove(p)) 
			System.out.println("your cart is empty.");
		else 
			this.money+=p.price;
			this.bonusPoint-=p.bonusPoint;
			cart.remove(p);
			System.out.println("refund " + p);
	}
	 
	void summary() {
		int totalCost= 0 ;
		String list = "";
		
		if(cart.isEmpty())
			return;
		
		for(int i = 0 ; i < cart.size() ; i++) {
			Product2 p = (Product2)cart.get(i);
			totalCost += p.price;
			list += (i==0) ? "" + p : " , " + p;

		}
		
		System.out.println(list);
		System.out.println(totalCost);
		
	}
	
	
}

