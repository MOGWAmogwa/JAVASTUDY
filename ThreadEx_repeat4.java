package java_repeat;
import javax.swing.JOptionPane;

public class ThreadEx_repeat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t1 = new ThreadTest();
		Runnable r = new ThreadTest2();
		
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();

	}

}


class ThreadTest extends Thread {
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(this.getName());
		}
	}
}

class ThreadTest2 implements Runnable {
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}