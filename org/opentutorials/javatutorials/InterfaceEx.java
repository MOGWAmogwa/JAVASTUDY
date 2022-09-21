package java_repeat;

public class InterfaceEx {

	public static void main(String[] args) {
		Fighter genzo = new Fighter();
		Fightable wooni = genzo.getFightable();
		genzo.attack(wooni);
		

	}

}

interface Fightable {
	abstract void move(int x ,int y);
	abstract void attack(Fightable f);
	
}

abstract class Unit {
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
	
}

class Fighter extends Unit implements Fightable{
	
	public void move(int x, int y ) {
		System.out.printf("[%d, %d]", x, y);
	}
	
	public void attack(Fightable f) {
		System.out.println("you choose fighter " + f);
		
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
	
	
}

