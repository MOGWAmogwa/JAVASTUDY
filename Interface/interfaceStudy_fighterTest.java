package Interface;


abstract class Unit {
	int x, y; 
	
	abstract void move (int x, int y);
	
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable {
	void move (int x, int y); 	// public abstract 가 생략된 상태 
	void attack (Fightable f); 	// public abstract 가 생략된 상태 
}

class Fighter extends Unit implements Fightable {
	// Overriding 규칙 : 접근제어자를 조상 클래스 메서드의 범위보다 좁게 변경할 수 없다. 
	public void move (int x, int y) {  
		System.out.printf("move to [%d, %d]%n", x, y);
	}; 	// public abstract 가 생략된 상태 
	public void attack (Fightable f) {
		System.out.println("attack" + f);
	}; 
	
	// 싸울 수 있는 상대를 불러온다 
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter 를 생성해서 반환 
		return f; 
	}
	
}


//The type Fighter must implement the inherited abstract method Fightable.attact(Fightable)

public class interfaceStudy_fighterTest {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		Unit f = new Fighter(); // Unit 에는 attack 이 없어서 호출 불가
		Unit u = new Fighter();
		u.move(100, 200);
		u.stop();
//		u.attack(f);  // Unit 에는 attack 이 없어서 호출 불가
		
		
		Fightable f = new Fighter();
		f.move(100, 200);
		f.attack(f); 
//		f.stop(); // Fightable 에는 stop이 없어서 호출 불가 
		
		Fighter kai = new Fighter();
		Fightable vi= kai.getFightable();
		vi.move(10, 10);
		
		kai.attack(vi);

	
		

	}

}
