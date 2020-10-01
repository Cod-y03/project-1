import java.util.Scanner;

public class YourAgeInSeconds 
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();
        System.out.println("Enter number of mounths: ");
        int mounths = scanner.nextInt();
        System.out.println("Enter number of days: ");
        int days = scanner.nextInt();

        if (mounths == 1) {mounths = 31;} else if (mounths == 2) {mounths = 31 + 28;}
        else if (mounths == 3) {mounths = 59 + 31;} else if (mounths == 4) {mounths = 90 + 30;}
        else if (mounths == 5) {mounths = 120 + 31;} else if (mounths == 6) {mounths = 151 + 30;}
        else if (mounths == 7) {mounths = 181 + 31;} else if (mounths == 8) {mounths = 212 + 31;}
        else if (mounths == 9) {mounths = 243 + 30;} else if (mounths == 10) {mounths = 273 + 31;}
        else if (mounths == 11) {mounths = 304 + 30;}

        int allsec = 24 * 3600 * (mounths + days + (years * 365));

        System.out.println("Life in Seconds: " + allsec);
        System.out.println("percentage" + ((allsec + 0.0) / 2500000) / 10);
    }
}