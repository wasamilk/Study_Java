package ch16_Decorator_Pattern;

// concreteComponent
public class KenyaAmericano extends Coffee{

	@Override
	public void brewing() {
		System.out.print("KenyaAmericano ");
	}

}
