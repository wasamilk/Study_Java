package ch17_Thread;


/**
 * 디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
 * MIN_PRIORITY : 1 |  MAX_PRIORITY : 10
 * 우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다
 * 확률이 높다는거지, 반드시 먼저 배분을 받는다는것은 아니다
 * */
class PriorityThread extends Thread {

	public void run() {

		int sum = 0;

		Thread t = Thread.currentThread();
		//sysout(thread) -> [Thread-0,1,main] -> Thread- num, priority, thread group.
		System.out.println(t + "start");

		for (int i = 0; i <= 1000000; i++) {
			sum += i;
		}

		System.out.println(t.getPriority() + "end");
	}
}

public class PriorityTest {

	public static void main(String[] args) {

		int i;
		for (i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {

			PriorityThread pt = new PriorityThread();

			pt.setPriority(i);
			pt.start();
			
		}
	}

}
