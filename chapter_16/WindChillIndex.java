import java.util.Scanner;
import java.lang.Math;
public class WindChillIndex
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Wind Speed: ");
        double speed = scanner.nextDouble();
        System.out.println("Enter Tempature: ");
        double temp = scanner.nextDouble();

        double chill = temp;

        if (speed > 3 && temp < 50) {
            chill = 35.74 + (0.6215*temp) - (35.75*Math.pow(speed, 0.16)) + (0.4275*temp*Math.pow(speed, 0.16));
        }
        System.out.println("Wind Chill: " + chill);

    }
}