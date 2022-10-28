package reservation_system_repeat10;

import java.util.*;

public class ReservationTest {

	public static void main(String[] args) {
	
		
			SeatType[] seatType = new SeatType[4];
			
			seatType[0] = new SeatType('R',5);
			seatType[1] = new SeatType('S',7);
			seatType[2] = new SeatType('A',9);
			seatType[3] = new SeatType('B',11);
			

			int choice = 0;
			while(choice != 4) {
				
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("=======================================");
				System.out.println("======YURA'S CONCERT RESERVATION=======");
				System.out.println("=======================================");
				
				
				System.out.println("예매 시스템에 접속하셨습니다. 원하시는 항목을 선택하여주십시오.");
				System.out.println(" (1) 예약 ");
				System.out.println(" (2) 조회 ");
				System.out.println(" (3) 취소 ");
				System.out.println(" (4) 종료 ");
				System.out.println(">>");
				
				
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1 : // 예매
					System.out.println("예매를 원하시는 좌석 타입을 선택하여 주십시오.");
					System.out.println(" (1) R석 ");
					System.out.println(" (2) S석 ");
					System.out.println(" (3) A석 ");
					System.out.println(" (4) B석 ");
					System.out.println(">>");
					
					int type = sc.nextInt();
					
					seatType[type-1].reservation();

					break;
				case 2 : // 조회
					for(int i = 0 ; i < seatType.length; i++) {

						seatType[i].show();
						System.out.println();
						System.out.println();
						System.out.println();
					}
					break;
				case 3 : // 취소
					
					break;
				case 4 : // 종료
					
					break;
				default :
					
	
					System.out.println("그런 번호는 없습니다 ");
					break;
				
				
				
	
				
				}
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
	}

}
