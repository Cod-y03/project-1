import java.util.Scanner;
public class OhmsLaw
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("voltage: ");
        int V = scanner.nextInt();
        System.out.println("resistance: ");
        int R = scanner.nextInt();
        int I = 0;

        System.out.println((V + 0.0) / R);
    }
}