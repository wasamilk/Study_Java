package ch01_innerClass;

class Outter2 {

	// Runnable- 클래스를 스레드화할 때 필요한 run()을 구현하기위한 인터페이스
	// 스레드를 구현하는 방법은 2가지이며 그 중 하나가 run()을 구현하는것
	Runnable getRunnable(int i) {

		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				// num = 200; //에러 남
				// i = 10; //에러 남
				System.out.println(i);
				System.out.println(num);
			}
		};
	}

	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");

		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();

		Runnable runnerble = out.getRunnable(10);
		runnerble.run();

		out.runner.run();
	}
}