import java.util.Scanner;
public class TownDump
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wieght: ");
        int weight = scanner.nextInt();

        int cost = 0;
        if (weight <= 200) {
            cost = 20;
        }
        if (weight > 200) {
            cost = 20 + (8 * (((weight - (weight % 100)) - 200) / 100));
        }

        System.out.println("It will cost: " + cost);
    }
}