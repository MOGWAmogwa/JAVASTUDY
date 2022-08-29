package Interface;

abstract class Unit1 {
	int x, y;
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("stop");
	}
	
}

interface Fightable1 {
	void move();
	void attack();
	
}


class Fighter1 extends Unit1 implements Fightable1 {
	
}



public class interfaceStudy_fighterTest_repeat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
