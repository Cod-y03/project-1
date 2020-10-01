import java.util.Scanner;

public class DistanceBrickTravels
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of secends:");
        float time = scanner.nextFloat();
        System.out.println("Distance: " + ((0.5 * 32.174 * time * time)));
    }

}