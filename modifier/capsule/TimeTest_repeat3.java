package modifier.capsule;

class Time3 {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}

	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour >23;
	}
	
	public int getHour() {
		return hour;
	}
	
	
	
}

public class TimeTest_repeat3 {

	public static void main(String[] args) {
		Time3 t3 = new Time3();
		t3.setHour(100);
		System.out.println(t3.getHour());
		
	}

}
