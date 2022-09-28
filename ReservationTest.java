package reservation_system_repeat2;
import java.util.*;
public class ReservationTest {

	public static void main(String[] args) {
		
		SeatType[] aSeatType =  new SeatType[4];

		aSeatType[0] = new SeatType('R', 5);
		aSeatType[1] = new SeatType('S', 7);
		aSeatType[2] = new SeatType('A', 10);
		aSeatType[3] = new SeatType('B', 12);

		int choice = 0 ;

		while(choice !=4) {

			System.out.println();
			System.out.println("====================[유라 콘서트 예약 시스템 입니다]====================");
			System.out.println("<1> 예약");
			System.out.println("<2> 조회");
			System.out.println("<3> 취소");
			System.out.println("<4> 종료");
			System.out.println(">>");

			Scanner in = new Scanner(System.in);

			choice = in.nextInt();

			int type;
			
			switch(choice) {
			
			case 1 : // 예약
				System.out.println("----------[원하시는 좌석을 선택하여 주십시오.]------------");
				System.out.println("<1> R 석");
				System.out.println("<2> S 석");
				System.out.println("<3> A 석");
				System.out.println("<4> B 석");
				System.out.println(">>");

				type = in.nextInt();

				if(type < 1 || type > aSeatType.length) {
					System.out.println("1~4 사이의 숫자를 입력하여 주십시오.");
					break;
				}

				aSeatType[type-1].reserveSeat();
				break;
				
			case 2 : // 조회

				for(int i = 0 ; i < aSeatType.length;  i++) {
					aSeatType[i].show();
				}
				System.out.println();
				System.out.println("조회를 완료하였습니다.");
				break;


			case 3 : // 취소

				System.out.println("----------[취소를 원하시는 좌석을 선택하여 주십시오.]------------");
				System.out.println("<1> R 석");
				System.out.println("<2> S 석");
				System.out.println("<3> A 석");
				System.out.println("<4> B 석");
				System.out.println(">>");

				type = in.nextInt();

				if(type < 1 || type > 4) {
					System.out.println("취소시 잘못된 자석 타입입니다");
					break;
				}

				if(aSeatType[type-1].cancel()) {
					System.out.println("취소하였습니다.");
					break;
				}
				

			case 4 : // 종료
				break;
				
			default:
				System.out.println("유호한 숫자가 아닙니다.");
				break;
				
				
			}

		}

	}

}
