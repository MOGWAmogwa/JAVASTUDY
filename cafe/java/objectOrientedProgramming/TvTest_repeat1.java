package cafe.java.objectOrientedProgramming;


class Tv {
	String color;
	boolean power;
	int channel;
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class TvTest_repeat1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 8;
		t.channelUp();
		System.out.println("The current channel is number " + t.channel);

	}

}
