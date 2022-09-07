package Interface;

abstract class Unit8 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable8 {
	abstract void move(int x, int y);
	abstract void attack(Fightable8 f);
}

class Fighter8 extends Unit8 implements Fightable8 {
	
	public void move (int x, int y) {
		System.out.printf("move to [%d,%d]%n", x, y);
	}
	
	public void attack(Fightable8 f) {
		System.out.println("attack to " + f);
	}
	
	Fightable8 getFightable() {
		Fighter8 f = new Fighter8();
		return f;
	}
	
	
}

public class interfaceStudy_fighterTest_repeat8 {

	public static void main(String[] args) {
		Fighter8 f = new Fighter8();
		Fightable8 f2 = f.getFightable();
		f.attack(f2);
		

		
		
		

		

	}

}

