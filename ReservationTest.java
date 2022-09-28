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
			System.out.println("====================[���� �ܼ�Ʈ ���� �ý��� �Դϴ�]====================");
			System.out.println("<1> ����");
			System.out.println("<2> ��ȸ");
			System.out.println("<3> ���");
			System.out.println("<4> ����");
			System.out.println(">>");

			Scanner in = new Scanner(System.in);

			choice = in.nextInt();

			int type;
			
			switch(choice) {
			
			case 1 : // ����
				System.out.println("----------[���Ͻô� �¼��� �����Ͽ� �ֽʽÿ�.]------------");
				System.out.println("<1> R ��");
				System.out.println("<2> S ��");
				System.out.println("<3> A ��");
				System.out.println("<4> B ��");
				System.out.println(">>");

				type = in.nextInt();

				if(type < 1 || type > aSeatType.length) {
					System.out.println("1~4 ������ ���ڸ� �Է��Ͽ� �ֽʽÿ�.");
					break;
				}

				aSeatType[type-1].reserveSeat();
				break;
				
			case 2 : // ��ȸ

				for(int i = 0 ; i < aSeatType.length;  i++) {
					aSeatType[i].show();
				}
				System.out.println();
				System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
				break;


			case 3 : // ���

				System.out.println("----------[��Ҹ� ���Ͻô� �¼��� �����Ͽ� �ֽʽÿ�.]------------");
				System.out.println("<1> R ��");
				System.out.println("<2> S ��");
				System.out.println("<3> A ��");
				System.out.println("<4> B ��");
				System.out.println(">>");

				type = in.nextInt();

				if(type < 1 || type > 4) {
					System.out.println("��ҽ� �߸��� �ڼ� Ÿ���Դϴ�");
					break;
				}

				if(aSeatType[type-1].cancel()) {
					System.out.println("����Ͽ����ϴ�.");
					break;
				}
				

			case 4 : // ����
				break;
				
			default:
				System.out.println("��ȣ�� ���ڰ� �ƴմϴ�.");
				break;
				
				
			}

		}

	}

}
