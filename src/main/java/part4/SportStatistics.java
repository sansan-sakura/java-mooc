
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String uri = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        int countGames = 0;
        int countWins =0;


        try(Scanner fileScanner = new Scanner(Paths.get(uri))){
            while(fileScanner.hasNext()){
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String guestTeam = parts[1];
                boolean isHomeTeamWon = Integer.valueOf(parts[2]) >Integer.valueOf(parts[3]);


                if(homeTeam.equals(teamName)){
                    countGames++;
                    if(isHomeTeamWon){
                        countWins++;
                    }

                }
                if(guestTeam.equals(teamName)){
                    countGames ++;
                    if(!isHomeTeamWon){
                        countWins++;
                    }
                }


            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

        System.out.println("Games: " + countGames);
        System.out.println("Wins: " +countWins);
        System.out.println("Losses: " + (countGames - countWins));

    }

}
