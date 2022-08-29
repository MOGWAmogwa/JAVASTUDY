package cafe.java.objectOrientedProgramming;

public class TvTest4_repeat6 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[5];
		
		for(int i = 0 ; i < tvArr.length ; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		
		for(int i = 0 ; i < tvArr.length ; i++) {
			System.out.println(tvArr[i].channel);
		}
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