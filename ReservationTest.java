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
				
				
				System.out.println("���� �ý��ۿ� �����ϼ̽��ϴ�. ���Ͻô� �׸��� �����Ͽ��ֽʽÿ�.");
				System.out.println(" (1) ���� ");
				System.out.println(" (2) ��ȸ ");
				System.out.println(" (3) ��� ");
				System.out.println(" (4) ���� ");
				System.out.println(">>");
				
				
				choice = sc.nextInt();
				
				switch(choice) {
				
				case 1 : // ����
					System.out.println("���Ÿ� ���Ͻô� �¼� Ÿ���� �����Ͽ� �ֽʽÿ�.");
					System.out.println(" (1) R�� ");
					System.out.println(" (2) S�� ");
					System.out.println(" (3) A�� ");
					System.out.println(" (4) B�� ");
					System.out.println(">>");
					
					int type = sc.nextInt();
					
					seatType[type-1].reservation();

					break;
				case 2 : // ��ȸ
					for(int i = 0 ; i < seatType.length; i++) {

						seatType[i].show();
						System.out.println();
						System.out.println();
						System.out.println();
					}
					break;
				case 3 : // ���
					
					break;
				case 4 : // ����
					
					break;
				default :
					
	
					System.out.println("�׷� ��ȣ�� �����ϴ� ");
					break;
				
				
				
	
				
				}
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
	}

}
