package ch18_MultiThread;

class Bank{
	
	private int money = 10000;

	// synchronized 메서드
	// - 현재 이 메서드가 속해있는 객체에 lock을 건다
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m + save);
	}

	public void minusMoney(int minus) {
		// synchronized 블럭
		// - 괄호안에 있는 공유자원(shared resource:현재객체 또는 다른 객체)에 lock을 건다
		synchronized (this) {
			int m = getMoney();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m - minus);
		}
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{
	public void run() {
		// synchronized (SyncMain.myBank){ 수행문; }
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
	}
}

public class SyncMain {

	// 공유 자원(shared resource)
	// SyncMain의 static변수(클래스변수) -> 접근법 : 클래스명.static변수
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Park p = new Park();
		p.start(); //start() call run()
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
	}
}
