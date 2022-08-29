package abstractClass;


abstract class Player2 {
	abstract void play();
	abstract void stop();
}

class AudioPlayer2 extends Player{
	void play(int position) {
		System.out.println("current position is " + position);
	}

	void stop() {
		System.out.println("stop");
	}
}

public class AbstractClassTest_repeat2 {

	public static void main(String[] args) {
		AudioPlayer2 ap = new AudioPlayer2();
		ap.play(3);
	}


}
