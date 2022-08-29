package modifier.capsule;

class Time4 {
	
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

public class TimeTest_repeat4 {

	public static void main(String[] args) {
		Time4 t4 = new Time4();
//		t4.hour = 3; //The field Time4.hour is not visible
		t4.setHour(23);
		System.out.println(t4.getHour());
		
	}

}



