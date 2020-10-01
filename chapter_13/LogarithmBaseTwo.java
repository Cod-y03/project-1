import java.util.Scanner;

public class LogarithmBaseTwo
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        double X = scanner.nextDouble();
        System.out.println("Base 2 log of " + X + " is: " + Math.log(X) / Math.log(2));

    }
}