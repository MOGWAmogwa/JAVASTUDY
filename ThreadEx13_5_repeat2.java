//package java_repeat;
//import javax.swing.JOptionPane;
//
//public class ThreadEx13_5_repeat2 {
//
//	public static void main(String[] args) {
//		ThreadEx13_1 t =new ThreadEx13_1();
//		t.start();
//		
//		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���. ");
//		System.out.println("�Է��Ͻ� ���� " +  input + " �Դϴ�.");
//	}
//
//}
//
//
//class ThreadEx13_1 extends Thread {
//	public void run() {
//		for(int i = 5 ; i > 0 ; i--) {
//			System.out.println(i);
//			try {
//				sleep(1000);
//			}catch(Exception e) {
//				
//			}
//		}
//	}
//}