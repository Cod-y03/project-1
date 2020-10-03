import java.util.Scanner;
public class InternetDelicatessen
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double delivery = 0;

        System.out.println("Enter the item: ");
        String item = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.println("Overnight delivery (0==no, 1==yes): ");
        int overnight = scanner.nextInt();

         if (price < 10) {
            delivery = 2.0;
        } else if (price >= 10) {
            delivery = 0;
        }
        if (overnight == 1) {
            delivery = delivery + 3.0;
        }
        System.out.println(item + "\t \t" + price + "\n delivery: \t" + delivery + "\n total: \t" + (delivery + price));
    }
}