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
//		// 쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다.
//		
//		t1.start();
//		t2.start();
//
//	}
//
//}
//
//// 두 가지 방법
//
//class ThreadEx1_1 extends Thread{ // 1. Thread 를 상속받기
//	public void run() { // Thread 가 수행할 작업을 작성
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println(this.getName());
//		}
//	}
//}
//
//
//class ThreadEx1_2 implements Runnable{ // 2. Runnable interface 를 구현하기
//	public void run() { // Thread 가 수행할 작업을 작성
//		for(int i = 0 ; i < 5 ; i++) {
//			// Thread.currentThread() - 현재 실행중인 Thread 를 반환한다.
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
//
