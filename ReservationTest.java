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
			
			System.out.println("======[���� �ܼ�Ʈ Ƽ�� ����]======");
			System.out.println("(1) ����");
			System.out.println("(2) ��ȸ");
			System.out.println("(3) ���");
			System.out.println("(4) ����");
			
			choice = in.nextInt();

			switch(choice) {
			case 1 : 
				System.out.println("======[���Ͻô� �¼� Ÿ���� �����Ͽ� �ֽʽÿ�.]=======");
				System.out.println("(1) R��");
				System.out.println("(2) S��");
				System.out.println("(3) A��");
				System.out.println("(4) B��");
				
				type = in.nextInt();
				

				if(type < 1 || type > seatType.length) {
					System.out.println("��ȿ���� ���� �¼� Ÿ���Դϴ�.");
					return;
				}
				
				seatType[type-1].reservation();
				break;
				
			case 2 : 
				System.out.println("�� �¼� ���� ��Ȳ ��ȸ");
				for(int i = 0; i < seatType.length ; i++) {
					seatType[i].show();
				}
				System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
				break;
			case 3: 
				System.out.println("======[��Ҹ� ���Ͻô� �¼� Ÿ���� �����Ͽ� �ֽʽÿ�.]=======");
				System.out.println("(1) R��");
				System.out.println("(2) S��");
				System.out.println("(3) A��");
				System.out.println("(4) B��");
				
				type = in.nextInt();
				

				if(type < 1 || type > seatType.length) {
					System.out.println("��ȿ���� ���� �¼� Ÿ���Դϴ�.");
					return;
				}
				
				seatType[type-1].cancel();
				
			}
			
			
		}

	}

}
