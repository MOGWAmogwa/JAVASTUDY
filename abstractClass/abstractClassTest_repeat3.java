package abstractClass;

abstract class Player{
	abstract void play (int pos);
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) {
		System.out.println("Play from" + pos);
	}
	void stop() {
		System.out.println("stop");
	}
}

public class abstractClassTest_repeat3 {

	public static void main(String[] args) {
		
		Player ap = new AudioPlayer();
		
		ap.play(30);
		ap.stop();
		

	}

}
