
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        ArrayList<String> teamGames = new ArrayList<String>();
        ArrayList<String> teamWins = new ArrayList<String>();
        ArrayList<String> teamLosses = new ArrayList<String>();
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            
            while (file.hasNextLine()) {
                String teamData = file.nextLine();
            
                //game count for team
                if (teamData.contains(teamName)) {teamGames.add(teamName);}
            
                //win / loose count for team
                String[] teamDetails = teamData.split(",");
                int firstTeamPoints = Integer.valueOf(teamDetails[2]);
                int secondTeamPoints = Integer.valueOf(teamDetails[3]);
                String firstTeamName = teamDetails[0];
                String secondTeamName = teamDetails[1];
                if ((firstTeamName.equals(teamName) && firstTeamPoints>secondTeamPoints) || (secondTeamName.equals(teamName) && secondTeamPoints>firstTeamPoints)) {
                    teamWins.add(teamName);
                } else if ((firstTeamName.equals(teamName) && firstTeamPoints<secondTeamPoints) || (secondTeamName.equals(teamName) && secondTeamPoints<firstTeamPoints)) {
                    teamLosses.add(teamName);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Games: "+teamGames.size());
        System.out.println("Wins: "+teamWins.size());
        System.out.println("Losses: "+teamLosses.size());
    }

}
