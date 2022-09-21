package java_repeat;
import java.util.*;

public class GenericEx_repeat1 {

	public static void main(String[] args) {
		
		ArrayList<Prodcut_a> productList = new ArrayList<Prodcut_a>();
		ArrayList<ApplePencil> applepencilList = new ArrayList<ApplePencil>();
		
		productList.add(new ApplePencil(3000));
		productList.add(new IPAD(4000));
		
		applepencilList.add(new ApplePencil(3000));
		// applepencilList.add(new IPAD(4000));  ¿À·ù
		
		
		System.out.println(productList);
		
		
		
		
	}

}

class Prodcut_a {
	int price ;
	int bonusPoint ;
	
	Prodcut_a(int price){
		this.price = price;
		this.bonusPoint = price/10;
	}
	
	
}

class ApplePencil extends Prodcut_a {
	
	ApplePencil(int price){
		super(price);
	}
	
	public String toString() {
		return "ApplePencil";
	}
	
}


class IPAD extends Prodcut_a {
	
	IPAD(int price){
		super(price);
	}
	
	public String toString() {
		return "IPAD";
	}
	
}



