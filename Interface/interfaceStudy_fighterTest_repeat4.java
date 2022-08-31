package Interface;

public class interfaceStudy_fighterTest_repeat4 {

	public static void main(String[] args) {
		Fighter4 genzo = new Fighter4();
		genzo.move(10, 20);
		Fightable4 vi=genzo.getFigther();
		vi.attack(new Fighter4());

	}

}


abstract class Unit4 {
	
	int x, y; 
	
	abstract void move (int x, int y);
	
	public void stop() {
		System.out.println("stop");
	}
	
	
}


interface Fightable4 {
	void move(int x, int y);
	void attack(Fightable4 f);

}


class Fighter4 extends Unit4 implements Fightable4{
	
	public void move (int x, int y) {
		System.out.printf("[%d,%d]%n", x, y);
	}
	
	public void attack(Fightable4 f) {
		System.out.println("you've chosen to fight with " +  f);
	}
	
	Fightable4 getFigther() {
		Fighter4 fighter = new Fighter4();
		return fighter;
	}

	
	
}







