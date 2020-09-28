import java.util.Scanner;

public class CorrectChange
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int amount = scanner.nextInt();

        int dollars = amount / 100;
        amount = amount % 100;
        int quarters = amount / 25;
        amount = amount % 25;
        int dimes = amount / 10;
        amount = amount % 10;
        int nickels = amount / 5;
        amount = amount % 5;
        int pennys = amount;

        System.out.println(dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennys + " pennys");
    }
}