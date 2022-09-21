package java_repeat;

public class InterfaceEx_repeat2 {

	public static void main(String[] args) {
		Fighter_ dao = new Fighter_();
		Fightable_ fighter = dao.getFighter();
		dao.attack(fighter);

	}

}

interface Fightable_ {
	abstract void move(int x, int y);
	abstract void attack(Fightable_ f);
}

abstract class Unit_{
	abstract void move(int x, int y);
	void stop() {
		System.out.println("stop");
	}
}

class Fighter_ extends Unit_ implements Fightable_{
	
	String[] fighters = {"Echo", "Jinx", "Vi"};
	
	public void move(int x, int y) {
		System.out.printf("[%d, %d]" , x, y);
	};
	
	public void attack(Fightable_ f) {
		System.out.println("you attack to " + f);
	};
	
	Fightable_ getFighter() {
		Fightable_ f = new Fighter_();
		return f;
	}
	
	public String toString() {
		int random = (int)(Math.random()*fighters.length);
		return fighters[random];


	}
	
	
}