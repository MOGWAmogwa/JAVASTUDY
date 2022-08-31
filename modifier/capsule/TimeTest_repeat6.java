package modifier.capsule;

public class TimeTest_repeat6 {

	public static void main(String[] args) {
		Time6 t = new Time6();
		t.setHour(26);
		System.out.println(t.getHour());
		t.setHour(22);
		System.out.println(t.getHour());
		
		

	}

}


class Time6 {
	private int hour ; 
	private int minute ; 
	private int second ; 
	
	public void setHour (int hour) {
		if(hour < 0 || hour > 23) 
			return;
		this.hour = hour;
		
	}
	
	public int getHour() {
		return hour;
	}
	
}

