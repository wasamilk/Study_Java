package FinalProject.player;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump O");
	}

	@Override
	public void turn() {
		System.out.println("turn X");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==== 중급자 ====");
	}

}
