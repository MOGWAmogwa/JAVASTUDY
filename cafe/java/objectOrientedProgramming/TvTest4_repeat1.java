package cafe.java.objectOrientedProgramming;

public class TvTest4_repeat1 {
	Tv[] tvArray = new Tv[3];
	
	for(int i = 0 ; i < tvArray.length ; i++) {
		tvArray[i] = new Tv();
		tvArray[i].channel = i + 10; 
		
	}
	
	for(int i = 0 ; i < tvArray.length ; i++) {
		tvArray[i].channelUp();
		System.out.printf("tvArray[%d].channel=%d%n", i , tvArray[i].channel);
		
	}
}


class Tv {
	String color;
	boolean power;
	int channel; 
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
		
	}

}