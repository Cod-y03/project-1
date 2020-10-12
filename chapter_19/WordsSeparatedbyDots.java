import java.util.Scanner;
public class WordsSeparatedbyDots
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = scanner.next();
        System.out.println("Enter second word: ");
        String second = scanner.next();

        int count = 30 - (second.length() + first.length());

        System.out.println(first);
        while (count > 0) {
            System.out.println("."); count = count - 1;
        }
        System.out.println(second);
    }
}