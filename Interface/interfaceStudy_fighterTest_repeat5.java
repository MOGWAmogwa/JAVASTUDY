package Interface;

public class interfaceStudy_fighterTest_repeat5 {

	public static void main(String[] args) {

		Fighter5 genzo = new Fighter5();
		genzo.move(10, 20);
		Fightable5 vi = genzo.getFighter();
		System.out.println(vi);
	}

}

interface Fightable5 {
	void move(int x, int y);
	void attack(Fightable5 f);
}

abstract class Unit5 {
	abstract void move(int x , int y);
	void stop() {
		System.out.println("stop");
	};
}

class Fighter5 extends Unit5 implements Fightable5{
	public void move(int x , int y) {
		System.out.printf("[%d, %d]%n" , x, y);
	}

	public void attack (Fightable5 f) {
		System.out.printf("you choose fighter who fight with you" , f);
	}


	Fightable5 getFighter() {
		Fighter5 f = new Fighter5();
		return f;
	}

}

// 인터페이스는 추상 클래스의 집합 나중에 디폴트 메서드에 대해서 이야기 하긴 하는데 일단 핵심은 추상 클래스 집합이고 그렇기 때문에 다중 상속이 가능하다. 

