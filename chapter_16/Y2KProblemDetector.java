import java.util.Scanner;

public class Y2KProblemDetector
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Date of Birth: ");
        int birth = scanner.nextInt();
        System.out.println("Current year: ");
        int current = scanner.nextInt();

        if (birth >= 21) {
            birth = birth + 1900;

        } else {
            birth = birth + 2000;
        }

        if (current >= 21) {
            current = current + 1900;

        } else {
            current = current + 2000;
        }

        System.out.println("Your age: " + (current - birth));
    }
}