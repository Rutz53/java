import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of runs scored by the player: ");
        int runsScored = scanner.nextInt();
        
        System.out.print("Enter the total number of times the player has been out: ");
        int timesOut = scanner.nextInt();
        
        double battingAverage = runsScored / (double) timesOut;
        
        System.out.println("The batting average of the player is: " + battingAverage);
    }
}
