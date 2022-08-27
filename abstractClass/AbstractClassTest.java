package abstractClass;



abstract class Player {
	abstract void play(int pos);
	abstract void stop();
}


class AudioPlayer extends Player {
	void play (int pos) {
		System.out.println("Play from " + pos);
	};
	void stop() {System.out.println("stop");};
}


public class AbstractClassTest {

	public static void main(String[] args) {

		Player ap = new AudioPlayer();

		ap.play(10);
		ap.stop();


	}

}


//abstract class AbstarctPlayer extends Player{ // 2개 중에 1개만 구현했기 때문에 미완성! 이라는게 중요포인트
//	void play (int pos) { /*내용 생략*/ };
//}