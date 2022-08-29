package modifier.capsule;

class Time1 {
	private int hour;
	private int minute;
	private int second;
	

	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
	
}

public class TimeTest_repeat1 {

	public static void main(String[] args) {
		Time1 t = new Time1();
		t.setHour(25);
		System.out.println(t.getHour());

		
	}

}
