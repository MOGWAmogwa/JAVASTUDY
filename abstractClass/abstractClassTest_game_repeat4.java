package abstractClass;

public class abstractClassTest_game_repeat4 {

	public static void main(String[] args) {
		Unit4[] group = new Unit4[3];
		
		group[0] = new Marine4();
		group[1] = new Tank4();
		group[2] = new Dropship4();
		
		group[0].attack(new Tank4());
		group[1].attack(new Dropship4());
		group[2].attack(new Marine4());
		
		

	}

}


abstract class Unit4 {
	int x ; 
	int y ; 
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	};
	
	abstract void attack(Unit4 u);
}

class Marine4 extends Unit4{
	
	 void move(int x , int y) {
		System.out.printf("Marine [%d, %d]%n", x, y);
	}
	 
	 void attack(Unit4 u) {
		 System.out.println("Marine's attack to  " + u);
	 }
	 
	 public String toString() {
		 return "Marine";
	 }
	
	

}

class Tank4 extends Unit4{
	
	 void move(int x , int y) {
		System.out.printf("Tank [%d, %d]%n", x, y);
	}
	
	 void attack(Unit4 u) {
		 System.out.println("Tank's attack to " + u);
	 }
	 
	 public String toString() {
		 return "Tank";
	 }
	
	

}

class Dropship4 extends Unit4{
	
	 void move(int x , int y) {
		System.out.printf("Dropship [%d, %d]%n", x, y);
	}
	 
	 void attack(Unit4 u) {
		 System.out.println("Dropship's attack to " + u);
	 }
	
	 public String toString() {
		 return "Dropship";
	 }
	 
	

}