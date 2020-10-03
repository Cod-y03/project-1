import java.util.Random;
import java.util.Scanner;

public class SnakeEye
{
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        System.out.println("How many times do you want to simulate the game: ");
        int repeats = scanner.nextInt();
        int counts = 0;
        int max = 5;
        int avgroll = 0;
        int avgscore = 0;
        double percentfour = 0;
        int turnroll = 0;
        int turnscore = 0;
        int fourscore = 0;
        int turns = 0;

        while (repeats >= counts) {
            boolean endroll = false;
            int singleturnroll = 0;
            //game
            while (endroll == false) {
                int roll = (randomGenerator.nextInt(max)) + (randomGenerator.nextInt(max)); 
                turnscore = turnscore + 2 + roll;
                turnroll = turnroll + 1;
                singleturnroll = singleturnroll + 1;
                System.out.println(singleturnroll);

                if (roll == 0) {
                    if (singleturnroll > 4) {
                        fourscore = fourscore + 1;
                    }
                    turns = turns + 1;
                    singleturnroll = 0;
                    endroll = true;
                }
            }            
            System.out.println(counts);
            counts = counts + 1;
        }
        avgscore = turnscore / repeats;
        avgroll = turnroll / repeats;
        percentfour = ((fourscore + 0.0) / (turns + 0.0)) * 100;

        System.out.println("The Average score over " + repeats + " simulations is: " + avgscore + "\n The average rolls was: " + avgroll + "\nThe percentage of over 4 rolls was: " + percentfour + "%");
    }
}