import java.util.Scanner;
public class FantasyGame 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest \nEnter the name of your character: ");
        String name = scanner.next();
        System.out.println("Enter strength: ");
        int strength = scanner.nextInt();
        System.out.println("Enter health: ");
        int health = scanner.nextInt();
        System.out.println("Enter luck: ");
        int luck = scanner.nextInt();

        if (luck + health + strength > 15) {
            System.out.println("You have give your character too many points! \nDefault values have been assigned: ");
            strength = 5;
            health = 5;
            luck = 5;
        }
        System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}