import java.util.Scanner;
public class HarmonicSum
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        double sum = 0;
        double n = scanner.nextDouble();
        while (n > 0) {
            sum = sum +  1/n;
            n = n -1;
        }
        System.out.println("Sum is: " + sum);
    }
}