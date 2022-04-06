package FinalProject.player;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.getLevel();
		player.play(1);

		player.upgradeLevel(new AdvancedLevel());
		player.getLevel();
		player.play(3);
		
		player.upgradeLevel(new SuperLevel());
		player.getLevel();
		player.play(5);
	}

}
