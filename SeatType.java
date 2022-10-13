package reservation_system_repeat8;
import java.util.*;

public class SeatType {

	char type;
	Seat[] seat;

	SeatType(char type, int num){
		this.type = type;
		seat = new Seat[num];
		for(int i = 0 ; i < seat.length ; i++) {
			seat[i] = new Seat();
		}
	} // constructor

	// 예약

	public void reservation() {

		Scanner in = new Scanner(System.in);

		System.out.println("예매자 분의 성함을 입력하여 주십시오.");
		String name = in.next();

		System.out.println("예매를 원하시는 좌석 번호를 입력하여 주십시오.");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("유효하지 않은 좌석 번호입니다.");
			return;
		}

		if(seat[seatNum-1].isOccupied()) {
			System.out.println("이미 예매되어 있는 좌석입니다.");
			return;
		}

		seat[seatNum-1].setName(name);
		System.out.println("예매가 완료되었습니다. ");

	}

	// 조회

	public void show() {
		System.out.println(type + "석");
		for(int i = 0 ; i < seat.length ; i++) {
			if(seat[i].isOccupied()) {
				System.out.print(seat[i].getName());
			}else {
				System.out.print(" ___ ");
			}
		}
		System.out.println();
	}

	// 취소 

	public void cancel() {
		Scanner in = new Scanner(System.in);

		System.out.println("취소하실 분의 성함을 입력하여 주십시오.");
		String name = in.next();

		System.out.println("취소를 원하시는 분의 좌석 번호를 입력하여 주십시오.");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("유효하지 않은 좌석 번호입니다.");
			return;
		}

		for(int i = 0 ; i < seat.length ; i++) {
			if(seat[i].getName() != null) {
				if(seat[i].getName().equals(name)) {
					seat[i].setName(null);
					System.out.println("취소를 완료하였습니다.");
				}

			}

		} // for
		System.out.println("예매자 명단에 이름이 없습니다.");



	}

}
