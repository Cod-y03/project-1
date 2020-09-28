import java.util.Scanner;

public class CentstoDollars
{
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
           System.out.println("What is it in cents.");
        
           int cent = scanner.nextInt();

           System.out.println("Its " + (cent / 100) + " Dollars and " + (cent % 100) + " Cents");

    }
}