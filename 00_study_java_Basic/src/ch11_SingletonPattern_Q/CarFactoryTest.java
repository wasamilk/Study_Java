package ch11_SingletonPattern_Q;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car car1 = factory.createCar();
		Car car2 = factory.createCar();

		System.out.println(car1);
		System.out.println(car2);
	}

}
