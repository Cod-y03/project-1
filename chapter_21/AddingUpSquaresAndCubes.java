import java.util.Scanner; 

public class AddingUpSquaresAndCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int limit = scanner.nextInt();
        int cubelimit = limit;
        int squaresum = 0;
        int cubesum = 0;
        while (limit > 0) {
            squaresum = squaresum + (limit * limit);
            limit = limit - 1;
        }

        while (cubelimit > 0) {
            cubesum = cubesum + (cubelimit * cubelimit * cubelimit);
            cubelimit = cubelimit - 1;
        }

        System.out.println("Square is: " + squaresum);

        System.out.println("Cube is: " + cubesum);

    }
}