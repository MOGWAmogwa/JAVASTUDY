package PolyArgument;


class Product {
	int price;
	int bonusPoint;

	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {

	Tv(){
		super(100);
	}
 

	// What does the toString() method in the object class return?
	// The toString() method returns the String representation of the object.
	public String toString () {
		return "Tv";
	}

}

class Computer extends Product {
	Computer() {super(200);}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0 ; 

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("Your balance is insufficient.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("You have bought " + p);
	}
}
public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("your balance : " + b.money);
		System.out.println("your bonus point : " + b.bonusPoint);


	}

}

/*
 * 다형성이란? 
 * 
 * 조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조하는 것
 * 
 * What is the purpose of the casting in java 참조변수의 형변환
 * 
 * 사용할 수 있는 멤버변수의 개수를 조절하기 위해서 (리모콘 바꾸기 )
 * 
 * Instanceof 형변환 가능여부 체크
 * 
 * 
 * 
 * 
 * */
