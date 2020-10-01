import java.util.Scanner;

public class AnnualApplianceCost
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt in cent:");
        float cost = scanner.nextFloat();

        System.out.println("Enter kilowatt-hours used per year:");
        float hours = scanner.nextInt();

        System.out.println("Annual cost: " + ((cost / 100) * hours));

    }
}