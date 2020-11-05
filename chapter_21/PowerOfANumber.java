import java.util.Scanner;

public class PowerOfANumber 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 1;
        System.out.println("Enter X: ");
        double X = scanner.nextDouble();
        System.out.println("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double num = exponent;

        if (exponent < 0) {
            System.out.println("the exponent can't be negative.");
        } 
        if (exponent > 0) {
            while (exponent > 0) {
                sum = sum * X;
                exponent = exponent - 1; 
            }
            System.out.println(X + " raised to the power of " + num + " is: " + sum);
        }
        
    }
}