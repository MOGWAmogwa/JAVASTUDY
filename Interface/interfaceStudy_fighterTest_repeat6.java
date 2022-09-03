package Interface;

public class interfaceStudy_fighterTest_repeat6 {
	public static void main (String[] args) {
		Fightable6 fe = new Fighter6();
		fe.move(20, 20);
		
		
		Fighter6 fe2 = new Fighter6();
		Unit6 u = new Fighter6();
		u.stop();
		u.move(20, 80);
		
		
		fe2.getFighter();
	}
}

interface Fightable6 {
	void move(int x , int y);
	void attack(Fightable6 f);
}

abstract class Unit6{
	int x , y ; 
	
	abstract void move(int x , int y);
	void stop() {
		System.out.println("stop");
	}
	
	
}

class Fighter6 extends Unit6 implements Fightable6 {
	
	public void move(int x , int y ) {
		System.out.printf("[%d, %d]%n", x, y);
	} 
	
	public void attack(Fightable6 f) {
		System.out.println("you attack" +  f);
	}
	
	Fightable6 getFighter() {
		Fighter6 f = new Fighter6();
		return f;
	}
	
	
	
	
}
