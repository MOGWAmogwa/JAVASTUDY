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

	// ����

	public void reservation() {

		Scanner in = new Scanner(System.in);

		System.out.println("������ ���� ������ �Է��Ͽ� �ֽʽÿ�.");
		String name = in.next();

		System.out.println("���Ÿ� ���Ͻô� �¼� ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("��ȿ���� ���� �¼� ��ȣ�Դϴ�.");
			return;
		}

		if(seat[seatNum-1].isOccupied()) {
			System.out.println("�̹� ���ŵǾ� �ִ� �¼��Դϴ�.");
			return;
		}

		seat[seatNum-1].setName(name);
		System.out.println("���Ű� �Ϸ�Ǿ����ϴ�. ");

	}

	// ��ȸ

	public void show() {
		System.out.println(type + "��");
		for(int i = 0 ; i < seat.length ; i++) {
			if(seat[i].isOccupied()) {
				System.out.print(seat[i].getName());
			}else {
				System.out.print(" ___ ");
			}
		}
		System.out.println();
	}

	// ��� 

	public void cancel() {
		Scanner in = new Scanner(System.in);

		System.out.println("����Ͻ� ���� ������ �Է��Ͽ� �ֽʽÿ�.");
		String name = in.next();

		System.out.println("��Ҹ� ���Ͻô� ���� �¼� ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
		int seatNum = in.nextInt();

		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("��ȿ���� ���� �¼� ��ȣ�Դϴ�.");
			return;
		}

		for(int i = 0 ; i < seat.length ; i++) {
			if(seat[i].getName() != null) {
				if(seat[i].getName().equals(name)) {
					seat[i].setName(null);
					System.out.println("��Ҹ� �Ϸ��Ͽ����ϴ�.");
				}

			}

		} // for
		System.out.println("������ ��ܿ� �̸��� �����ϴ�.");



	}

}
