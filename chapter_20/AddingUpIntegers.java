import java.util.Scanner;
public class AddingUpIntegers
{
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers will be added");
        int repeats = scanner.nextInt();
        while (repeats > 0) {
            System.out.println("Enter an Integer: ");        
            int number = scanner.nextInt();
            sum = sum + number;
            repeats = repeats - 1;
        }
System.out.println("The sum is " + sum);
    }
}