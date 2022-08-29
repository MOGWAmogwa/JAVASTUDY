package cafe.java.objectOrientedProgramming;

public class TvTest4 {

	public static void main(String[] args) {
		Television[] tvArray = new Television[3];
		
		for (int i = 0 ; i < tvArray.length; i++) {
			tvArray[i] = new Television();
			tvArray[i].channel = i + 10; 
		}
		
		for (int i = 0 ; i < tvArray.length; i++) {
			tvArray[i].channelUp();
			System.out.printf("tvArray[%d].channel=%d%n", i , tvArray[i].channel);
		}

	}

}

class Television {
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

