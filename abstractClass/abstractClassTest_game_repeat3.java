package abstractClass;

public class abstractClassTest_game_repeat3 {

	public static void main(String[] args) {
		
		Unit3[] group = new Unit3[3];
		group[0] = new Marine3();
		group[1] = new Tank3();
		group[2] = new Dropship3();
		
		group[0].move(10, 10);
		group[1].move(20, 20);
		group[2].move(30, 30);
		


	}

}

abstract class Unit3 {
	int x , y; 
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	};

}


class Marine3 extends Unit3 {

	void move(int x, int y){
		System.out.printf(" Marine coordinate : %d , %d %n", x, y);
	}
}


class Tank3 extends Unit3 {

	void move(int x, int y){
		System.out.printf(" Tank coordinate : %d , %d %n", x, y);
	}
}



class Dropship3 extends Unit3 {

	void move(int x, int y){
		System.out.printf(" Dropship coordinate : %d , %d %n", x, y);
	}
}


