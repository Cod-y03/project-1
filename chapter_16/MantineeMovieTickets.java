import java.util.Scanner;

public class MantineeMovieTickets
{   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter time(millitary time): ");
        int time = scanner.nextInt();
        int cost = 0;
        String word = " "; 

        if (age > 13) {
            if (time > 1700 && time <= 2200) {
                cost = 5;
            } else if (time > 2200) {
                cost = 4;
            } else {
                cost = 5;
            }
        } else {
            if (time > 1700 && time <= 2200) {
                cost =2;
            } else if (time > 2200) {
                word = "Not allowed at this time";
            } else {
                cost = 4;
            }
        }

        System.out.println("Cost: " + word + cost);

    }
}