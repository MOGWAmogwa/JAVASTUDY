package exercise_7;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	private int prevVolume;
	
	final int MAX_VOLUME = 100; 
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1; 

	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME )
			return;
		this.prevVolume = this.volume;
		this.volume = volume;
		

	
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int gotoPrevChannel() {
		return prevChannel;
	}
	
	public int gotoPrevVolume() {
		return prevVolume;
	}
	
}

public class 연습문제7_10 {

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.setVolume(30);
		tv.setChannel(50);
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		
		tv.setVolume(50);
		tv.setChannel(80);
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		
		
		System.out.println(tv.gotoPrevChannel());
		System.out.println(tv.gotoPrevVolume());
		
		

		
		
		


	}

}
