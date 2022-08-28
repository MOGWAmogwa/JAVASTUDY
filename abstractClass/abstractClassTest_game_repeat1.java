package abstractClass;

public class abstractClassTest_game_repeat1 {

	public static void main(String[] args) {
		Unit1[] group = new Unit1[3];
		group[0] = new Marine1();
		group[1] = new Tank1();
		group[2] = new Dropship1();
		
		
		group[0].move(15, 15);
		group[1].move(20, 14); 
		group[2].move(123, 113);

	}
	


}


abstract class Unit1{
	int x,y;
	abstract void move(int x, int y);
	void stop() {};
}

class Marine1 extends Unit1 {
	void move(int x, int y) {
		System.out.printf("Marine [x=%d, y=%d]%n", x, y);
	}
	void stimpack() {};
}

class Tank1 extends Unit1 {
	void move(int x, int y) {
		System.out.printf("Tank1 [x=%d, y=%d]%n", x, y);
	}
	
	void changeMode() {};
}

class Dropship1 extends Unit1 {
	void move(int x, int y) {
		System.out.printf("Dropship1 [x=%d, y=%d]%n", x, y);
	}
}