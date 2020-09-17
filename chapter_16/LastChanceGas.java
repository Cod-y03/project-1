import java.util.Scanner;

public class LastChanceGas 
{
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your tank capacity?");
        int capacity = scanner.nextInt();
        System.out.println("what's your gage reading?(in percentages)");
        int gage = scanner.nextInt();
        System.out.println("what's your miles per gallon?");
        int mpg = scanner.nextInt();

        if ((capacity * (gage / 100) * mpg) >= 200) {
            System.out.println("Safe to proceed");
        } else {
            System.out.println("Get gas");
        }

    }

}