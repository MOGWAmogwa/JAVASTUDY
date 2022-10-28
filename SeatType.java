package reservation_system_repeat10;
import java.util.*;

public class SeatType {
	
	char type;
	
	Seat[] seat;
	
	SeatType(char type , int num){
		this.type = type;
		seat = new Seat[num];
		for(int i = 0 ; i < seat.length ; i++) {
			seat[i] = new Seat();
		}
		
	} // 생성자 

	
	
	// 예약
	public void reservation() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 좌석 번호를 입력하여주십시오.");
		int seatNum = sc.nextInt()-1;
		
		System.out.println("예매자분의 성함을 입력하여 주십시오.");
		String name = sc.next();
		
		
		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("그런 좌석 번호는 없습니다.");
		}
		
		if(!seat[seatNum].isOccupied()) {
			seat[seatNum].setName(name);
			System.out.println("예매가 완료되었습니다.");
		} else {
			System.out.println("이미 예매된 좌석입니다.");
		}
		
				

	}
	
	
	// 조회
	
	public void show() {
		System.out.println(type + "석 예매 현황입니다.");
		for(int i = 0 ; i < seat.length; i ++) {

			if(seat[i].isOccupied()) {
				System.out.print(seat[i].getName() + "");
			}else {
				System.out.print(" ___ ");
			}
			
			
		}
	}
	
	
	// 취소
	
	public void cancel() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("취소를 원하시는 좌석 번호를 입력하여주십시오.");
		int seatNum = sc.nextInt()-1;
		
		System.out.println("취소하실 분의 성함을 입력하여 주십시오.");
		String name = sc.next();
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
