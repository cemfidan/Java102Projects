import java.util.Scanner;

public class Game {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	
	public void Run() {
		
		boolean isRun = true;
		
		System.out.println("============= A D V E N T U R E  G A M E =============");
		System.out.print("\nEnter your name: ");
		String playerName = scanner.nextLine();
		
		Player player = new Player(playerName);
		
		System.out.println("\nWelcome " + player.getName() + ", please enjoy..");
		
		player.selectChar();
		
		while(isRun) {
			player.showPlayer();
			player.selectLoc();
			  
			if(!isRun) {
				System.out.println("G A M E  O V E R");
				break;
			}
		}
	}
	
}
