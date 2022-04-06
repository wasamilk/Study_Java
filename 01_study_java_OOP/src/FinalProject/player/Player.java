package FinalProject.player;

public class Player {
	
	PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
	}
	
	public void getLevel() {
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
		this.level.go(count);
	}
}
