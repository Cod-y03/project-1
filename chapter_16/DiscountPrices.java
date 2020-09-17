import java.util.Scanner;

public class DiscountPrices {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the cost of your item?");
        double cost = scanner.nextInt();
        
        if (cost > 10) {
            double off = cost * 0.10;
            cost = cost - off;
        }
        System.out.println("Your cost is " + cost);
            
    }
}