package ch16_Decorator_Pattern;

// ConcreteDecorator
public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee); //상위클래스에 default생성자 없을 경우 명시적으로 상위클래스 생성자를 적어줘야함.
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}

}
