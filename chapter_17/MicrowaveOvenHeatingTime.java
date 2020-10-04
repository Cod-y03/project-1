import java.util.Scanner;
public class MicrowaveOvenHeatingTime
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items: ");
        int item = scanner.nextInt();
        System.out.println("How much time for 1 item: ");
        double time = scanner.nextInt();

        if (item == 2) {
            time = time * 1.5;
        }
        if (item == 3) {
            time = time * 2;
        }
        if (item > 3) {
            System.out.println("heating more than 3 items is not recomended");
        }
        double minutes = (time - (time % 100))/ 100;
        double seconds = time % 100;
        if (item < 4) {
            System.out.println("heat for: " + minutes + " minutes and " + seconds + " seconds");
        }
    
    }
}