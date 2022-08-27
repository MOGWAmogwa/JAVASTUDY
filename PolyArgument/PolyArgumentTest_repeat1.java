package PolyArgument;

public class PolyArgumentTest_repeat1 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();	
		
		b.buy(new Tv1(3000));
		b.buy(new Computer1(2000));
		
		System.out.println("your balance : " + b.money);
		System.out.println("your bonus point : " + b.bonusPoint);

	}

}


class Product1 {
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	
}

class Tv1 extends Product1 {
	
	Tv1(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}


class Computer1 extends Product1 {
	
	Computer1(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer1 {
	int money = 10000;
	int bonusPoint = 0 ; 
	
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("your balance is insufficient.");
			return;
		} else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println("You've bought " + p );
		}
	}
}
























