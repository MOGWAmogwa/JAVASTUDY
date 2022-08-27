package abstractClass;

public class abstractClassTest_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Unit[] group = {new Marine() , new Tank() , new Dropship() };
//		for (int i = 0 ; i < group.length ; i++) {
//			group[i].move(100,200);
//		}
		
		Unit[] group = new Unit[3];
//		Object[] group = new Object[3]; // object 참조변수에는 move 버튼이 없다.
		group[0] =  new Marine();
		group[1] = new Tank ();
		group[2] = new Dropship();
		
		group[0].move(100, 200); 
		group[1].move(100, 200);
		group[2].move(100, 200);
		


	}
	
}

abstract class Unit {
	int x , y;
	abstract void move (int x, int y);
	void stop() {
		/* stop at current position*/
	}
}

class Marine extends Unit {
	void move (int x , int y) {
		System.out.printf("Marine [x=%d, y=%d]%n", x, y);
	}
	void stimPack() {};
}

class Tank extends Unit {
	void move (int x , int y) {
		System.out.printf("Tank [x=%d, y=%d]%n", x, y);
	}

	void changeMode() { /* 공격모드로 변환한다. */ }
}

class Dropship extends Unit {
	void move (int x , int y) {
		System.out.printf("Dropship [x=%d, y=%d]%n", x, y);
	}

}