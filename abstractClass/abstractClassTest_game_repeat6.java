package abstractClass;

public class abstractClassTest_game_repeat6 {

	public static void main(String[] args) {
		Unit6[] group = new Unit6[3];
		for(int i = 0 ; i < group.length; i++) {
			group[i] = new Tank6();
		}
		
	group[0].move(3, 3);

	}

}

abstract class Unit6 {
	int x , y ; 
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	};
	
}

class Tank6 extends Unit6 {
	public void move (int x, int y ) {
		System.out.printf("Tank6 pos = [%d, %d]%n" , x,y);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Marine6 extends Unit6 {
	public void move (int x, int y ) {
		System.out.printf("Marine6 pos = [%d, %d]%n" , x,y);
	}
	
	public String toString() {
		return "Marine6";
	}
}

class Dropship6 extends Unit6 {
	public void move (int x, int y ) {
		System.out.printf("Dropship6 pos = [%d, %d]%n" , x,y);
	}
	
	public String toString() {
		return "Dropship6";
	}
}
