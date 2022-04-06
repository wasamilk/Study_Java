package FinalProject.player;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump O");
	}

	@Override
	public void turn() {
		System.out.println("turn O");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==== 고급자 ====");
	}
}
