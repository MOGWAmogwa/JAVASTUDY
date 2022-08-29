package Interface;

abstract class Unit2 {
	int x , y;
	
	abstract void move (int x, int y);
	
	void stop() {
		System.out.println("stop");
	}
}

interface Fightable2 {
	void move (int x , int y); // public abstract 가 생략된 상태 
	void attack(Fightable2 f); // public abstract 가 생략된 상태 
}


class Fighter2 extends Unit2 implements Fightable2{

	public void move(int x , int y ) { // 접근제어자를 조상 클래스 메서드 보다 좁은 범위로 설정할 수 없다. 
		System.out.printf("move to [%d, %d]%n ", x, y );
	}
	
	public void attack(Fightable2 f) {
		System.out.println("attack to "+f);
	}
	
	// 싸울 수 있는 상대를 불러온다 
	Fightable2 getFightable() {
		Fighter2 f = new Fighter2(); // fighter 를 생성해서 반환
		return f; 
	}
}

public class interfaceStudy_fighterTest_repeat2 {

	public static void main(String[] args) {
		
		Fighter2 f = new Fighter2();
		Fightable2 f2 = f.getFightable();
		

	}

}
