package ch16_Decorator_Pattern;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}


}
