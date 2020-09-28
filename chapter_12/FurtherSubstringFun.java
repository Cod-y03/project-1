import java.util.Scanner;
public class FurtherSubstringFun
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string:");

        String first = scanner.nextLine();
        System.out.println("Enter beginning index: ");
        int beginning = scanner.nextInt();
        System.out.println("Enter Ending index: ");
        int end = scanner.nextInt();

        String sub = first.substring(beginning, end);
        System.out.println(sub);

    }

}