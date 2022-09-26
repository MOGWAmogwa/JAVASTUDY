package java_repeat;
import java.util.*;
public class GenericsEx {

	public static void main(String[] args) {
		
		ArrayList<Product_g> productList= new ArrayList<Product_g>();
		
		ArrayList<Tv_g> tvList= new ArrayList<Tv_g>();
		
	//  List<Product_g> a =new ArrayList<Tv_g>(); // 이건 안됨
		List<Tv_g> a = new ArrayList<Tv_g>();  // 다형성 적용
		
		productList.add(new Tv_g());
		productList.add(new Audio_g());
		
		tvList.add(new Tv_g());
		
	//	tvList.add(new Audio_g());  Error
		
		
		

		
	}

}


class Product_g{}

class Tv_g extends Product_g {}

class Audio_g extends Product_g {}

