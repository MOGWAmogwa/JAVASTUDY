package abstractClass;

abstract class Unit2{
	int x, y;
	 
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}


class Marine2 extends Unit2{
	void move (int x, int y) {
		System.out.printf("Marine [x=%d, y=%d]%n", x, y);
	}
	void stimpack() {};
}

class Tank2 extends Unit2{
	void move (int x, int y) {
		System.out.printf("Tank2 [x=%d, y=%d]%n", x, y);
	}
	void changeMode() {};
}


class Dropship2 extends Unit2{
	void move (int x, int y) {
		System.out.printf("Dropship2 [x=%d, y=%d]%n", x, y);
	}
}



public class abstractClassTest_game_repeat2 {

	public static void main(String[] args) {
		Unit2[] group = new Unit2[3];
		group[0] = new Marine2 ();
		group[1] = new Tank2 ();
		group[2] = new Dropship2 ();
		
		group[0].move(0, 0);

	}

}
