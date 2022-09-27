//package java_repeat;
//import java.util.*;
//
//public class InterfaceEx_repeat6 {
//
//	public static void main(String[] args) {
//		Fighter genzo = new Fighter();
//		Fightable a =genzo.getFigtable();
//		genzo.attack(a);
//
//	}
//
//}
//
//interface Fightable{
//	abstract void move(int x , int y);
//	abstract void attack(Fightable f);
//}
//
//abstract class Unit{
//	abstract void move(int x, int y);
//	void stop() {
//		System.out.println("stop");
//	}
//}
//
//class Fighter extends Unit implements Fightable{
//	
//	String[] fighters = {"echo","jinx","vi","catylin"};
//	public void attack(Fightable f) {
//		System.out.println("attack to " + f);
//
//	};
//	
//	public void move(int x, int y) {
//		System.out.printf("[%d, %d]", x, y);
//	};
//	
//	Fightable getFigtable() {
//		Fightable f = new Fighter();
//		return f;
//	}
//
//}
//
