package reservation_system_repeat2;
import java.util.*;

public class SeatType {

	private char type;
	Seat[] aSeat ;

	SeatType(char type, int num){

		this.type = type;

		aSeat = new Seat[num];

		for(int i = 0 ; i < aSeat.length ; i++) {
			aSeat[i] = new Seat();
		}

	} // constructor

	public boolean reserveSeat() {

		Scanner in = new Scanner(System.in);

		show();


		System.out.println();
		System.out.println("예약하실 고객님의 성함을 입력하여 주십시오. >>");
		String name = in.next();

		System.out.println("좌석번호  :");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > aSeat.length) {
			System.out.println("유효하지 않은 좌석 번호 입니다.");
			return false;
		}

		if(aSeat[seatNum-1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}

		aSeat[seatNum-1].reserveName(name);
		return true;

	}

	public boolean cancel() {
		Scanner in = new Scanner(System.in);

		System.out.println("취소를 원하신다면 성함을 입력하여 주십시오. >>");
		String name = in.next();

		int count = 0 ;
		if(name != null) { // 이름이 비어있지 않으면
			for (int i = 0 ; i < aSeat.length ; i++) {
				if(aSeat[i].name.equals(name)) {
					aSeat[i].name = null; // 이름을 null로 만들것임
					return true;
				}
				
				if(aSeat[i].name == null) {
					count++;
					
				}
				
				if(count==aSeat.length) {
					System.out.println("예약 명단에 없습니다.");
					return false;
				}
		
			}
		}

		return false;
	}

	public void show() {
		System.out.println();
		System.out.println(type + "석 좌석 현황입니다.");

		for(int i = 0 ; i < aSeat.length ; i++) {
			if(aSeat[i].isOccupied()) {
				System.out.print(aSeat[i].getName());
			} else {
				System.out.print(" " + " ___ " );
			}


		}

		System.out.println();


	}




}
