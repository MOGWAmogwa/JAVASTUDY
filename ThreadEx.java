//package java_repeat;
//
//public class ThreadEx {
//
//	public static void main(String[] args) {
//		
//		ThreadEx1_1 t1 = new ThreadEx1_1();
//		
//		Runnable r = new ThreadEx1_2();
//		Thread t2 = new Thread(r); 
//		
//		// �����带 ������ �Ŀ� start()�� ȣ���ؾ� �����尡 �۾��� �����Ѵ�.
//		
//		t1.start();
//		t2.start();
//
//	}
//
//}
//
//// �� ���� ���
//
//class ThreadEx1_1 extends Thread{ // 1. Thread �� ��ӹޱ�
//	public void run() { // Thread �� ������ �۾��� �ۼ�
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println(this.getName());
//		}
//	}
//}
//
//
//class ThreadEx1_2 implements Runnable{ // 2. Runnable interface �� �����ϱ�
//	public void run() { // Thread �� ������ �۾��� �ۼ�
//		for(int i = 0 ; i < 5 ; i++) {
//			// Thread.currentThread() - ���� �������� Thread �� ��ȯ�Ѵ�.
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
//
