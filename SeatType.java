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
		System.out.println("�����Ͻ� ������ ������ �Է��Ͽ� �ֽʽÿ�. >>");
		String name = in.next();

		System.out.println("�¼���ȣ  :");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > aSeat.length) {
			System.out.println("��ȿ���� ���� �¼� ��ȣ �Դϴ�.");
			return false;
		}

		if(aSeat[seatNum-1].isOccupied()) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return false;
		}

		aSeat[seatNum-1].reserveName(name);
		return true;

	}

	public boolean cancel() {
		Scanner in = new Scanner(System.in);

		System.out.println("��Ҹ� ���ϽŴٸ� ������ �Է��Ͽ� �ֽʽÿ�. >>");
		String name = in.next();

		int count = 0 ;
		if(name != null) { // �̸��� ������� ������
			for (int i = 0 ; i < aSeat.length ; i++) {
				if(aSeat[i].name.equals(name)) {
					aSeat[i].name = null; // �̸��� null�� �������
					return true;
				}
				
				if(aSeat[i].name == null) {
					count++;
					
				}
				
				if(count==aSeat.length) {
					System.out.println("���� ��ܿ� �����ϴ�.");
					return false;
				}
		
			}
		}

		return false;
	}

	public void show() {
		System.out.println();
		System.out.println(type + "�� �¼� ��Ȳ�Դϴ�.");

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
