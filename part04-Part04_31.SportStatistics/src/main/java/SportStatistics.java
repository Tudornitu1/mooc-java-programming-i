
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file=scan.nextLine();
        System.out.println("Team:");
        String team=scan.nextLine();
        int k=0;
        int wins=0;
        int losses=0;
        ArrayList<Match> match= readRecords(file);
        for(Match matches:match){
            if(matches.getTeam1().equals(team)){
                k++;
            } else if(matches.getTeam2().equals(team)){
                k++;
            }
            if((matches.getTeam1().equals(team)&&matches.getScore1()>matches.getScore2())||(matches.getTeam2().equals(team)&&matches.getScore2()>matches.getScore1())){
                wins++;
            } else if((matches.getTeam1().equals(team)&&matches.getScore1()<matches.getScore2())||(matches.getTeam2().equals(team)&&matches.getScore2()<matches.getScore1())){
                losses++;
            }
        }
        System.out.println("Games: "+k);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: "+losses);
    }

    public static ArrayList<Match> readRecords(String file){
        ArrayList<Match> match = new ArrayList<>();

        try (Scanner scanner=new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts=line.split(",");
                String team1=parts[0];
                String team2=parts[1];
                int score1= Integer.valueOf(parts[2]);
                int score2= Integer.valueOf(parts[3]);
                match.add(new Match(team1,team2,score1,score2));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return match;
    }

}
