import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumberGenerator = new Random();
        int max = 9;
        int count = 10;
        int correct = 0;

        while (count > 0) {
            int iOne = randomNumberGenerator.nextInt(max);
            int iTwo = randomNumberGenerator.nextInt(max);
            System.out.println("What is " + iOne + " * " + iTwo + "?");
            int answer = scanner.nextInt();
            if (answer == iOne * iTwo) {
            System.out.println("Right");
            correct += 1;
            } else {
            System.out.println("Wrong. " + iOne + " * " + iTwo + " is " + (iOne * iTwo));
           }
           count -= 1;
        }
        System.out.println("You got " + correct + " out of 10 questions correct!");
        
    }
}
