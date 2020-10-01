import java.util.Scanner;

public class HarmonicMean
{
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();

        System.out.print("Average: " + (x * y) / 2);
        System.out.print("\nHarmonic Mean: " + (1 / x) + (1 / y));


    }



}