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
        int turnroll = 0;
        int turnscore = 0;
        int fourscore = 0;
        
        while (repeats >= counts) {
            boolean endroll = false;
            int singleturnroll = 0;
            //game
            while (!endroll) {//this loop is one turn or simulation for the game
                int max = 5;
                int roll = (randomGenerator.nextInt(max)) + (randomGenerator.nextInt(max)); 
                turnscore = turnscore + 2 + roll; //the +2 is to acount for randoms 0-5 count
                turnroll = turnroll + 1; //counting all the rolls
                singleturnroll = singleturnroll + 1; //counting the rolls within 1 turn
                
                if (roll == 0) { //0 is snake eyes
                    if (singleturnroll > 4) { //used to check if there were more then 4 roll in this turn
                        fourscore = fourscore + 1;
                    }
                    singleturnroll = 0;
                    endroll = true; //ends the while loop for a turn
                }
            }            
            counts = counts + 1;
        }
        int avgscore = turnscore / repeats;
        int avgroll = turnroll / repeats;
        double percentfour = ((fourscore + 0.0) / (repeats + 0.0)) * 100;

        System.out.println("In " + repeats + " simulations the average score is: " + avgscore + "\n The average rolls was: " + avgroll + "\nThe percentage of over 4 rolls was: " + percentfour + "%");
    }
}