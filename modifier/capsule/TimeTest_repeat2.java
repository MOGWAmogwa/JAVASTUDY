package modifier.capsule;


class Time2 {
	private int hour;
	private int minute;
	private int second;

	Time2 (int hour){
		if(isNotValidHour(hour))
			return;
		this.hour = hour;
	}

	private boolean isNotValidHour(int hour) {
		return hour<0 || hour > 23;
	}

	public int getHour() {
		return hour;
	}

}
public class TimeTest_repeat2 {

	public static void main(String[] args) {

		Time2 t = new Time2(23);
		System.out.println(t.getHour());



	}

}

// 이렇게 하면 시간을 설정한건지 뭔지 저 숫자가 뭘 의미하는지 알수가 업어서 그냥 setHour 이런식으로 함수를 쓰는게 더 나은 것 같다. 
