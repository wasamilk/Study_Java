package ch17_Thread;

import java.io.IOException;

public class TerminateThread extends Thread{

	// 예전엔 thread.stop()으로 멈췄지만, 요즘은 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name){
		super(name);
	}
	
	public void run(){
		
		while(!flag){
			try {
				sleep(100);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println( getName() + " end" );
		
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {

		// Thread생성자에 String을 전달하면 전달한 String이 스레드의 이름이 된다
		TerminateThread threadA = new TerminateThread("A"); 
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true){
			in = System.in.read();
			if ( in == 'A'){
				threadA.setFlag(true);
			}else if(in == 'B'){
				threadB.setFlag(true);
			}else if( in == 'C'){
				threadC.setFlag(true);
			}else if( in == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}else{
				System.out.println("type again");
			}
		}
		
		System.out.println("main end");
		
	}
}

