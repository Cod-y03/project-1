import java.util.Scanner;
public class GroundBeefValueCalculator 
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price per pound package A: ");
        double pricea = scanner.nextDouble();
        System.out.println("Percent lean package A: ");
        double percenta = scanner.nextDouble();
        System.out.println("Price per pound package B: ");
        double priceb = scanner.nextDouble();
        System.out.println("Percent lean package B: ");
        double percentb = scanner.nextDouble();

        System.out.println("Package A cost per pound of lean: " + (pricea / (percenta / 100) ) );
        System.out.println("Package B cost per pound of lean: " + (priceb / (percentb / 100) ) );

        if ( (pricea / (percenta / 100) ) < (priceb / (percentb / 100) ) ) {
            System.out.println("Package A is the best vale" );
        } else {
            System.out.println("Package B is the best vale" );

        }
    }
}