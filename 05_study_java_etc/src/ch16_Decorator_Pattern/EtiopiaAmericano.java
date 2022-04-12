package ch16_Decorator_Pattern;

//concreteComponent
public class EtiopiaAmericano extends Coffee{

	@Override
	public void brewing() {
		System.out.print("EtiopiaAmericano ");
	}

}
