import java.util.Scanner;

public class OrderChecker 
{

    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many bolts do you have?");
        int bolt = scanner.nextInt();

        System.out.println("How many nuts do you have?");
        int nut = scanner.nextInt();

        System.out.println("How many washers do you have?");
        int washer = scanner.nextInt();

        if (nut >= bolt && (washer*2) >= bolt) {
            System.out.println("\nOrder is OK");
        } else if (nut < bolt) {
            System.out.println("\nCheck Order: to few nuts");
        } else if ((washer*2) < bolt) {
            System.out.println("\nCheck Order: to few washers");
        }

        System.out.println("\nNumber of bolts:" + bolt);
        System.out.println("Number of nuts:" + nut);
        System.out.println("Number of washers:" + washer);
        System.out.println("\nTotal cost:" + ((bolt * 5) + (nut * 3) + washer));





    }
}