package TIS_JAVA_STUDY;

public class InterfaceEx_repeat1 {

	public static void main(String[] args) {
		
		Fighter1 vi = new Fighter1();
		Fightable1 figther = vi.getFightable();
		vi.attack(figther);
		
	}

}

interface Fightable1 {
	abstract void move(int x, int y);
	abstract void attack(Fightable1 f);
}

abstract class Unit1 {
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}

class Fighter1 extends Unit1 implements Fightable1 {
	
	String[] fighters = {"echo", "wooni", "dao", "jiwoo"};
	
	public void move (int x, int y) {
		System.out.printf("position [%d, %d]", x , y);
	}
	
	public void attack(Fightable1 f) {
		System.out.println("attack to " + f);
		
	}
	
	Fightable1 getFightable() {
		Fightable1 f = new Fighter1();
		return f;
	}
	
	public String toString() {
		int random = (int)(Math.random()*fighters.length);
		return fighters[random];
	}
	
}

