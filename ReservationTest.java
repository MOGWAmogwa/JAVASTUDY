package reservation_system_repeat8;
import java.util.*;

public class ReservationTest {

	public static void main(String[] args) {
		
		SeatType[] seatType = new SeatType[4];
		
		seatType[0] = new SeatType('R', 5);
		seatType[1] = new SeatType('S', 7);
		seatType[2] = new SeatType('A', 9);
		seatType[3] = new SeatType('B', 11);
		
		int choice = 0 ;
		
		while(choice != 4) {
			
			int type;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("======[유라 콘서트 티켓 예매]======");
			System.out.println("(1) 예매");
			System.out.println("(2) 조회");
			System.out.println("(3) 취소");
			System.out.println("(4) 종료");
			
			choice = in.nextInt();

			switch(choice) {
			case 1 : 
				System.out.println("======[원하시는 좌석 타입을 선택하여 주십시오.]=======");
				System.out.println("(1) R석");
				System.out.println("(2) S석");
				System.out.println("(3) A석");
				System.out.println("(4) B석");
				
				type = in.nextInt();
				

				if(type < 1 || type > seatType.length) {
					System.out.println("유효하지 않은 좌석 타입입니다.");
					return;
				}
				
				seatType[type-1].reservation();
				break;
				
			case 2 : 
				System.out.println("전 좌석 예매 현황 조회");
				for(int i = 0; i < seatType.length ; i++) {
					seatType[i].show();
				}
				System.out.println("조회를 완료하였습니다.");
				break;
			case 3: 
				System.out.println("======[취소를 원하시는 좌석 타입을 선택하여 주십시오.]=======");
				System.out.println("(1) R석");
				System.out.println("(2) S석");
				System.out.println("(3) A석");
				System.out.println("(4) B석");
				
				type = in.nextInt();
				

				if(type < 1 || type > seatType.length) {
					System.out.println("유효하지 않은 좌석 타입입니다.");
					return;
				}
				
				seatType[type-1].cancel();
				
			}
			
			
		}

	}

}
