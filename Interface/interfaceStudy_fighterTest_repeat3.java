package Interface;

abstract class Unit3 {
	int x , y ; 
	
	abstract void move(int x, int y); // public 이 생략된 것인지..?
	
	void stop() {
		System.out.println("stop");
	}
	
}

interface Fightable3 {
	 void move(int x, int y); //public abstract 생략이 가능하다
	 void attack(Fightable3 f); // public abstract 생략이 가능하다 
}

class Fighter3 extends Unit3 implements Fightable3{
	
	public void move(int x, int y ) {
		System.out.printf("move to [%d, %d]", x, y);
	}
	
	public void attack(Fightable3 f) {
		System.out.println("attack to " + f);
	}
	
	Fightable3 getFightable() {
		Fighter3 f = new Fighter3();
		return f;
	}
	
	
	
	
}
public class interfaceStudy_fighterTest_repeat3 {

	public static void main(String[] args) {
		Fighter3 f= new Fighter3();
		
		Fightable3 fe = f.getFightable();
		fe.attack(f);
		fe.attack(new Fighter3());

		

	}

}

