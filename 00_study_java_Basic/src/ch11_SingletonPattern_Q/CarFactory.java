package ch11_SingletonPattern_Q;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	private static int serialNum = 1001;
	
	private CarFactory() {}

	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
			return instance;
		}
		return instance;
	}
	
	// 차 생산
	public Car createCar() {
		Car car = new Car();
		car.setCarNum(serialNum);
		serialNum ++;
		return car;
	}
}
