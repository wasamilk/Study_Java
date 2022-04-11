package ch01_innerClass;

class Outer {

	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 100;
		
		// 지역 내부 클래스(local inner class) 클래스의 지역변수화..
		// 이것의 이름을 없앤것이 익명내부클래스이다.
		class MyRunnable implements Runnable { 

			int localNum = 10;

			@Override
			public void run() {
				// run()이 다시 호출되었을 경우, num과 i는 getRunnable()의 지역변수여서 사라지고 없어서
				/// ...?
				// num = 200; //에러 남. 지역변수는 상수로 바뀜
				// i = 100;   //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				System.out.println("i =" + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

//지역 내부 클래스 
public class LocalInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}