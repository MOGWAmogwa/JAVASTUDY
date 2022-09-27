//package java_repeat;
//import java.util.*;
//public class FruitBox_MakeJuice_repeat5 {
//
//	public static void main(String[] args) {
//		
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		fruitBox.add(new Apple());
//		fruitBox.add(new Kiwi());
//		
//		System.out.println(Juicer.makeJuice(fruitBox));
//		
//
//	}
//
//}
//
//class Juice{
//	String name;
//	
//	Juice(String name){
//		this.name = name;
//	}
//	
//	public String toString() {
//		return name;
//	}
//	
//}
//
//
//class Juicer {
//	
//	public static Juice makeJuice(FruitBox<? extends Fruit> box) {
//		
//		String tmp = "";
//		
//		for(Fruit f : box.getBox())  {
//			tmp += f ;
//		}
//		
//		return new Juice(tmp);
//		
//	}
//	
//}
//class Fruit {
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//
//class Apple extends Fruit {
//	public String toString() {
//		return "Apple";
//	}
//}
//
//
//class Kiwi extends Fruit {
//	public String toString() {
//		return "Kiwi";
//	}
//}
//
//class FruitBox<T extends Fruit> extends Box<T>{
//	
//}
//
//class Box<T>{
//	ArrayList<T> box = new ArrayList<T>();
//	
//	void add (T t) {
//		box.add(t);
//	}
//	
//	ArrayList<T> getBox(){
//		return box;
//	}
//	
//	T get(int i) {
//		return box.get(i);
//	}
//	
//	int size() {
//		return box.size();
//	}
//	
//	
//	
//}