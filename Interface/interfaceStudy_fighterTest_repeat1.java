package Interface;

abstract class Unit1{
	int x, y; 
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("stop");
	}
	
}

interface Fightable1{
	void move(int x , int y);
	void attack(Fightable1 f);
}

class Fighter1 extends Unit1 implements Fightable1{
	
	public void move(int x, int y) {
		System.out.printf("move to [%d, %d]%n", x, y);
	}
	
	public void attack(Fightable1 f) {
		System.out.println("attack" + f);
	}
	
	Fightable1 getFightable() {
		Fighter1 f = new Fighter1();
		return f;
		
	}
}

public class interfaceStudy_fighterTest_repeat1 {

	public static void main(String[] args) {
		Fighter1 echo = new Fighter1();
		Fightable1 vi = echo.getFightable();
		vi.attack(echo);
		
		
	}

}
