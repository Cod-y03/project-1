import java.util.Scanner;

public class PieEatingContest 
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your weight");
        int wieght = scanner.nextInt();

        if (wieght > 220 && wieght < 280) {
            System.out.println("Allowed to contest");
        } else {
            System.out.println("Not allowed to contest");

        }
    } 
}