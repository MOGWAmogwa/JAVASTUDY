//package java_repeat;
//import java.util.*;
//
//public class FruitBox_repeat6 {
//
//	public static void main(String[] args) {
//		Busket<Flower> flowerBusket = new Busket<Flower>();
//		Busket<Daisy> daisyBusket = new Busket<Daisy>();
//		Busket<Rose> roseBusket = new Busket<Rose>();
//		
//		flowerBusket.add(new Flower());
//		flowerBusket.add(new Daisy());
//		flowerBusket.add(new Rose());
//		
////		daisyBusket.add(new Flower()); // error
//		daisyBusket.add(new Daisy());
//		
//		
//		
//	}
//
//}
//
//class Busket<T> {
//	
//	ArrayList<T> list = new ArrayList<T>();
//	
//	public void add(T t) {
//		list.add(t);
//	}
//}
//
//class Flower{
//	public String toString() {
//		return "Flower";
//	}
//}
//
//
//class Daisy extends Flower{
//	public String toString() {
//		return "Daisy";
//	}
//}
//
//
//
//class Rose extends Flower{
//	public String toString() {
//		return "Rose";
//	}
//}