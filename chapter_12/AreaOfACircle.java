import java.util.Scanner;

public class AreaOfACircle 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("What is the radius?");
        int radius = scanner.nextInt();

        double area = 2 * radius * Math.PI;
        System.out.println("Circle area: " + area);

    }

}