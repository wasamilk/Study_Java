package ch16_Decorator_Pattern;

public class WhippedCream extends Decorator{

	public WhippedCream(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding WhippedCream ");
	}
}
