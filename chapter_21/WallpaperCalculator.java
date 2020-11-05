import java.util.Scanner;

public class WallpaperCalculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room hieght: ");
        int hieght = scanner.nextInt();
        System.out.println("Enter room length: ");
        int length = scanner.nextInt();
        System.out.println("Enter room width: ");
        int width = scanner.nextInt();
        System.out.println("Enter amount of openings: ");
        int opennings = scanner.nextInt();

        int roomspace = ((2 * hieght * length) + (2 * hieght * width));

        while (opennings > 0) {
            System.out.println("Enter openning hieght: ");
            int openinghieght = scanner.nextInt();
            System.out.println("Enter openning length: ");
            int openinglength = scanner.nextInt();
            int openingarea = openinghieght * openinglength; 
            roomspace = roomspace - openingarea;
            opennings = opennings - 1;
        }
        int wallpapers = (roomspace / 162) + 1;
        System.out.println("The rolls of wallpaper needed is: " + wallpapers);
    }
}