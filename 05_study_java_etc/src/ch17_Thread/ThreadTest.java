package ch17_Thread;

// 스레드만들기1 : Thread 클래스 상속하여 만들기
class MyThread extends Thread {

	// 쓰레드 생성시 자동 호출?
	public void run() {
		int i;
		for (i = 0; i < 200; i++) {
			System.out.println(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();

		th1.start();
		th2.start();
		
		System.out.println("end");
		
		
	}
}
