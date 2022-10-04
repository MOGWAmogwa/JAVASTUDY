//package java_repeat;
//
//public class ThreadEx13_6 {
//
//	public static void main(String[] args) {
//		ThreadEx6_1 th1 = new ThreadEx6_1();
//		ThreadEx6_2 th2 = new ThreadEx6_2();
//
//		th2.setPriority(7);
//
//		System.out.println("Priority of th1(-)" + th1.getPriority());
//		System.out.println("Priority of th2(|)" + th2.getPriority());
//
//		th1.start();
//		th2.start();
//
//		//Priority of th1(-)5 기본값이 5라서
//		// 우선순위가 높은 쓰레드가 작업이 일찍 끝나도록 되어있음 (단, 항상 그런 것은 아님)
//	}
//
//}
//
//
//class ThreadEx6_1 extends Thread {
//	public void run() {
//		for(int i = 0 ; i < 300 ; i++) {
//			System.out.println("-");
//			for(int x = 0 ; x < 10000000; x++); // 시간지연용  for 문
//		}
//	}
//}
//
//class ThreadEx6_2 extends Thread {
//	public void run() {
//		for(int i = 0 ; i < 300 ; i++) {
//			System.out.println("|");
//			for(int x = 0 ; x < 10000000; x++);
//		}
//	}
//}

