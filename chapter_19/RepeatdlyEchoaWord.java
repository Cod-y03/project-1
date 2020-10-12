import java.util.Scanner;
public class RepeatdlyEchoaWord
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scanner.next();
        System.out.println("\n");
        int times = word.length();
        int count = 0;
        while (times > count) {
            System.out.println(word);
            count = count + 1; 
        }
    }
}