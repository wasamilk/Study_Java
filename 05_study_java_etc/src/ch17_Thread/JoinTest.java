package ch17_Thread;

/**
 * 동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용
 * join() 함수를 호출한 Thread가 not-runnable 상태가 감
 * 다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴
 * */
public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public void run(){
	
		int i;
		for(i = start; i <= end; i++){
			System.out.println("+ " + i);
			total += i;
		}
	}
	

	// main 또한 스레드이다 
	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 10);
		JoinTest jt2 = new JoinTest(11, 20);
		
				
		jt1.start();
		jt2.start();
		
		try{
			// join() 함수를 호출한 Thread(main)가 not-runnable 상태가 감
			jt1.join();
			jt2.join();
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
		
				
	}

}
