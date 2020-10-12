import java.util.Scanner;
public class RunofIntegers
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start: ");
        int start = scanner.nextInt();
        System.out.println("Enter End: ");
        int end = scanner.nextInt();
        System.out.println("\n");

        if (start > end) {
        System.out.println("Can't do");
        }
        while (start < (end + 1)) {
            System.out.println(start);
            start = start + 1;
        }
    }
}