import java.util.Scanner;
public class SteamEngineEfficiency 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Air temp(kelvin): ");
        double Tair = scanner.nextInt();
        System.out.println("Steam temp(kelvin): ");
        double Tsteam = scanner.nextInt();

        double efficincy = 1 - Tair / Tsteam;
        if (Tsteam < 373) {
            efficincy = 0;
        }
        System.out.println("Efficincy: " + efficincy);

    }
}