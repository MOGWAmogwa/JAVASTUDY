package Interface;

abstract class Unit7 {
	int x, y ; 
	
	abstract void move(int x , int y);
	
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable7 {
	void move (int x , int y);
	void attack (Fightable7 f);
}

class Fighter7 extends Unit7 implements Fightable7 {
	public void move (int x, int y ) {
		System.out.printf("move to [%d,%d]%n", x, y);
	}
	public void attack (Fightable7 f) {
		System.out.println("attack" + f);
	}
	
	Fightable7 getFightable() {
		Fighter7 f = new Fighter7();
		return f;
	}
	
}

public class interfaceStudy_fighterTest_repeat7 {

	public static void main(String[] args) {

		Unit7 u = new Fighter7();
		u.move(20, 20);
		u.stop();
		
		Fighter7 f = new Fighter7();
		Fightable7 f2 = new Fighter7();
		f.attack(f2);
		
		Fightable7 f3 = f.getFightable();
		
		f.attack(f3);
		
		
		
	}

}
