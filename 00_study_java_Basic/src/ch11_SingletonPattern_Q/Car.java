package ch11_SingletonPattern_Q;

public class Car {

	private int carNum;

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	@Override
	public String toString() {
		return "Car [carNum=" + carNum + "]";
	}
	
	
}
