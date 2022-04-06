package ch06_template_method_pattern;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
			
	// 시나리오는 변경 할 수 없도록 final 메소드로 선언 -> 메서드의 final은 재정의불가를 의미
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}