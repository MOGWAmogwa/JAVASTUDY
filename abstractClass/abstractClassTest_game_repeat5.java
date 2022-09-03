package abstractClass;

public class abstractClassTest_game_repeat5 {

	public static void main (String[] args) {

		Unit5[] group = new Unit5[3];

		group[0] = new Marine5();
		group[1] = new Tank5();
		group[2] = new Dropship5();

		group[0].move(10, 10);
		group[1].move(20, 20);
		group[2].move(30, 30);


	}

}

abstract class Unit5 {

	int x , y ; 
	abstract void move(int x, int y);

	void stop() {
		System.out.println("stop");
	};

}


class Marine5 extends Unit5 {

	void move (int x, int y) {
		System.out.printf(" Marine5 [ %d , %d ] %n" , x, y);
	}

	void stimpack() {
		System.out.println("stimpack");
	}


}


class Tank5 extends Unit5 {

	void move (int x, int y) {
		System.out.printf(" Tank5 [ %d , %d ] %n" , x, y);
	}

	void attack() {
		System.out.println("tank attack");
	}


}


class Dropship5 extends Unit5 {

	void move (int x, int y) {
		System.out.printf(" Dropship5 [ %d , %d ] %n" , x, y);
	}

	void attack() {
		System.out.println("drop");
	}


}



