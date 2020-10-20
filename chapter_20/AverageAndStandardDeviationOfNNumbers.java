import java.util.Scanner;

import java.util.Scanner;

public class AverageAndStandardDeviationOfNNumbers {
    public static void main(String[] args) {
        double sum = 0;
        double squaresum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers will be added");
        double repeats = scanner.nextDouble();
        double count = repeats;
        while (repeats > 0) {
            System.out.println("Enter an Integer: ");        
            double number = scanner.nextDouble();
            sum = sum + number;
            squaresum = squaresum + (number * number);
            repeats = repeats - 1;
        }
        double average = sum / count;
        double avgSquare = squaresum / (average * average);
        double sd = Math.sqrt(avgSquare - (average * average));
        System.out.println("The average is " + average + " the deviation is " + sd);
    }
} 