//package java_repeat;
//
//import javax.swing.JOptionPane;
//
//public class ThreadEx13_5 {
//
//	public static void main(String[] args) {
//
//		ThreadEx13 th1 = new ThreadEx13();
//		th1.start();
//		
//		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���.");
//		System.out.println("�Է��Ͻ� ���� " + input  + " �Դϴ�.");
//		
//	}
//
//}
//
//
//class ThreadEx13 extends Thread {
//	public void run() {
//		for(int i = 10; i > 0 ; i--) {
//			System.out.println(i);
//			try {
//				sleep(1000);
//			}catch(Exception e) {}
//		}
//	} // run()
//}