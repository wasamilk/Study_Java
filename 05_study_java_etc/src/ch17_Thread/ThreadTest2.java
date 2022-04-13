package ch17_Thread;

//스레드만들기2 : Runnable클래스 구현하여 만들기 (클래스가 다른클래스를 상속받았을 경우 이렇게 구현)
class MyThread2 implements Runnable{

	public void run(){
		int i;
		for(i=0; i<200; i++){
			System.out.print(i + "\t");
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println("main start");
		
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		th1.start();
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		System.out.println("main end");
		
		// 내부익명클래스?
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
	}

}
