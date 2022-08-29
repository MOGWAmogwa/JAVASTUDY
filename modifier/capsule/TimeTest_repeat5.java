package modifier.capsule;

class Time5 {
	private int hour;
	private int minute;
	private int second;
	

	public void setHour (int hour) {
		if(hour<0 || hour>23) {
			return;
		}
		this.hour = hour;
	}
	public int getHour () {
		if(hour==0) {
			System.out.println("The hour has not been set up yet.");
		}
		return hour;
	}
}

public class TimeTest_repeat5 {

	public static void main(String[] args) {
		Time5 t = new Time5();
		t.setHour(25);

		System.out.println(t.getHour());
		

	}

}


/* 매개변수의 타입이 인터페이스인 경우?
 * 
 * 인터페이스를 구현한 클래스의 인스턴스만 가능하다. */

