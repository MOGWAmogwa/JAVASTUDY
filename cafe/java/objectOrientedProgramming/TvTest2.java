package cafe.java.objectOrientedProgramming;

class Tv2 {
	String color;
	boolean power;
	int channel; 
	
	void power() {
		power = !power;
		
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDwon() {
		--channel;
	
	}
	
	
}
public class TvTest2 {

	
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1's channel value is " + t1.channel + " now.");
		System.out.println("t2's channel value is " + t2.channel + " now.");
		
		t1.channel = 7;
		System.out.println("You have changed channel value into " + t1.channel + " now.");
		
		System.out.println("t1's channel value is " + t1.channel + " now.");
		System.out.println("t2's channel value is " + t2.channel + " now.");
		
	}

}
