package abstractClass;

abstract class Player1{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer1 extends Player1{
	void play(int pos) {
		System.out.println("Play from " + pos);
	}
	
	void stop() {
		System.out.println("stop");
	}
}

public class AbstractClassTest_repeat1 {

	public static void main(String[] args) {
		Player1 p = new AudioPlayer1();
		
		p.play(3);

	}

}



































