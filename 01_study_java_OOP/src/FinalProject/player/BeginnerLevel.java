package FinalProject.player;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump X");
	}

	@Override
	public void turn() {
		System.out.println("turn X");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==== 초심자 ====");
	}

}
