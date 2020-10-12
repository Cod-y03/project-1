import java.util.Scanner;
public class SumofSequentialIntegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        int count = 0;
        int sum = 0;
        while (count < (n + 01)) {
            sum = sum + count;
            count = count + 1;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Formula sum: " + (n*(n+1))/2);


    }
}