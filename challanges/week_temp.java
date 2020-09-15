import java.util.Scanner;

public class week_temp 
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System .in); 
        
        System.out.println("Please enter the temp for Monday.");
        int monday = scanner.nextInt();

        System.out.println("Please enter the temp for Tuesday.");
        int tuesday = scanner.nextInt();


        System.out.println("Please enter the temp for Wednesday.");
        int wednesday = scanner.nextInt();


        System.out.println("Please enter the temp for Thursday.");
        int thursday = scanner.nextInt();


        System.out.println("Please enter the temp for Friday.");
        int friday = scanner.nextInt();


        System.out.println("Please enter the temp for Saterday.");
        int saterday = scanner.nextInt();


        System.out.println("Please enter the temp for Sunday.");
        int sunday = scanner.nextInt();

        double avg = ((monday + tuesday +wednesday + thursday + friday + saterday + sunday) / 7.0);

        System.out.println("The average temp is " + avg);
    }
}
