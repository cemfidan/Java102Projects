import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Round {

	private boolean isRun = true;
	private int teamNum;

	ArrayList<String> teams = new ArrayList<>();
    ArrayList<String> teamBack = new ArrayList<>();
    ArrayList<String> teamBack2 = new ArrayList<>();
    ArrayList<Integer> teamInt = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);

	public void Run() {

		System.out.println("\n========== F I X T U R E  B U I L D E R ==========\n");

		while (isRun) {
			System.out.print("Enter the number of teams: ");
			teamNum = scanner.nextInt();
			if (teamNum > 2) {
				for (int i = 0; i < teamNum; i++) {
					System.out.print("Team name: ");
					String teamName = scanner.next();
					teams.add(teamName);
				}
				if (teamNum % 2 != 0) {
					teams.add("Bay");
				}
				System.out.println("\nTeams:");
				for (String team : teams) {
					System.out.println("- " + team);
				}
				System.out.println();
				isRun = false;
			}
			
			int roundNum = (teams.size() - 1) * 2;
			int roundPerMatchNum = teams.size() / 2;

			for(int i = 0; i < roundNum; i++) {
				System.out.println("Round " + (i+1) + "\n");
	            for (int j = 0; j < roundPerMatchNum; j++){
	            	Match(teams, teamBack, teamBack2, teamInt);
	            }
	            for (Object j : teamBack){
	                System.out.println("- " + j + "\n");
	            }
	            teamInt.clear();
	            teamBack.clear();
	            System.out.println("===================");
			}
		}
	}
	
	public void Match(ArrayList teams, ArrayList teamBack, ArrayList teamBack2, ArrayList teamInt){
		
		Random random = new Random();
		
		int homeTeam = random.nextInt(teams.size());
        while (teamInt.contains(homeTeam)){
        	homeTeam = random.nextInt(teams.size());
        }

        int awayTeam = random.nextInt(teams.size());
        while (awayTeam == homeTeam || teamInt.contains(awayTeam)){
        	awayTeam = random.nextInt(teams.size());
        }

        String str = homeTeam + " vs " + awayTeam;

        while (teamBack2.contains(str)){
        	homeTeam = random.nextInt(teams.size());
            while (teamInt.contains(homeTeam)){
            	homeTeam = random.nextInt(teams.size());
            }

            awayTeam = random.nextInt(teams.size());
            while (awayTeam == homeTeam || teamInt.contains(awayTeam)){
            	awayTeam = random.nextInt(teams.size());
            }
            str = homeTeam + " vs " + awayTeam;
        }
        teamInt.add(homeTeam);
        teamInt.add(awayTeam);
        teamBack.add(teams.get(homeTeam) + " vs " + teams.get(awayTeam));
        teamBack2.add(str);
	}
	
}
