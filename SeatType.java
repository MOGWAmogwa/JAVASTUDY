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
		
	} // ������ 

	
	
	// ����
	public void reservation() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���Ͻô� �¼� ��ȣ�� �Է��Ͽ��ֽʽÿ�.");
		int seatNum = sc.nextInt()-1;
		
		System.out.println("�����ں��� ������ �Է��Ͽ� �ֽʽÿ�.");
		String name = sc.next();
		
		
		if(seatNum < 1 || seatNum > seat.length) {
			System.out.println("�׷� �¼� ��ȣ�� �����ϴ�.");
		}
		
		if(!seat[seatNum].isOccupied()) {
			seat[seatNum].setName(name);
			System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
		}
		
				

	}
	
	
	// ��ȸ
	
	public void show() {
		System.out.println(type + "�� ���� ��Ȳ�Դϴ�.");
		for(int i = 0 ; i < seat.length; i ++) {

			if(seat[i].isOccupied()) {
				System.out.print(seat[i].getName() + "");
			}else {
				System.out.print(" ___ ");
			}
			
			
		}
	}
	
	
	// ���
	
	public void cancel() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ҹ� ���Ͻô� �¼� ��ȣ�� �Է��Ͽ��ֽʽÿ�.");
		int seatNum = sc.nextInt()-1;
		
		System.out.println("����Ͻ� ���� ������ �Է��Ͽ� �ֽʽÿ�.");
		String name = sc.next();
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
