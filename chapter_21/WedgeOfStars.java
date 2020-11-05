import java.util.Scanner;

public class WedgeOfStars 
{
    public static void main(String[] args) {
        String star = "*";
        String allstars = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stars: ");
        int amount = scanner.nextInt();
        int count = amount;
        while (count > 0) {
            while (amount > 0) {
                allstars = allstars + star;
                amount = amount - 1;
            }
            System.out.println(allstars);
            count = count - 1;
            amount = count;
            allstars = "";
        }

    }
}