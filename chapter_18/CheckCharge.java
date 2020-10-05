import java.util.Scanner;
public class CheckCharge
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your saving account balance?");
        double saving = scanner.nextDouble();
        System.out.println("What is your checking account balance?");
        double checking = scanner.nextDouble();
        double charge = 0;

        if (saving >= 1000 || saving >= 1500) {
            charge = 0;
        } else {
            charge = 0.150;
        }

        System.out.println("The service charge is " + charge);
    }
}