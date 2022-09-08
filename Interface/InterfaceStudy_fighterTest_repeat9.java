package Interface;

public class InterfaceStudy_fighterTest_repeat9 {
	public static void main(String[] args) {
		Fighter9 genzo = new Fighter9();
		
	}

}

interface Fightable9 {
	abstract void move(int x , int y);
	abstract void attack(Fightable9 f);
}


abstract class Unit9{
	int x , y;
	abstract void move(int x , int y);
	void stop() {
		System.out.println("stop");
	}
}

class Fighter9 extends Unit9 implements Fightable9{
	
	public void move(int x, int y) {
		System.out.printf("[%d, %d]%n" , x, y);
	}
	
	public void attack(Fightable9 f) {
		System.out.println("attack to " + f);
	}
	
	Fightable9 getFightable() {
		Fighter9 ft = new Fighter9();
		return ft;
	}
	

}