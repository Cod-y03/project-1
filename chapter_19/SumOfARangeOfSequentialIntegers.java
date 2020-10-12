import java.util.Scanner;
public class SumOfARangeOfSequentialIntegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = scanner.nextInt();
        
        System.out.println("Enter low: ");
        int high = scanner.nextInt();
        
        int minus = ((low - 1)*(low))/2;
        System.out.println(minus);

        int sum = ((high*(high + 1)) / 2) - minus;
        
        System.out.println("Sum: " + sum);


    }
}