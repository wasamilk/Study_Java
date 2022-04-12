package ch16_Decorator_Pattern;

// Decorator
// 왜 abstract? 구현 전부 했어도 상속용으로만 사용할거기때문
public abstract class Decorator extends Coffee{

	Coffee coffee;
	public Decorator(Coffee coffee){
		// 파라미터로 들어오는건 최상위 Component타입으로 선언되어있으므로,
		// component나 decorator 모두 들어올 수 있음
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
