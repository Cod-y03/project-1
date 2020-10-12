import java.util.Scanner;
public class OneLetterPerLine
{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String index = scanner.next();
        int count = index.length();
        int countleft = count;
        char letter = index.charAt(count);
        System.out.println(countleft);
        // while (countleft > 0) {
        //     count = count - countleft;
        //     char letter = index.charAt(count);
        //     System.out.println("here");
        //     System.out.println(letter);
        //     countleft = countleft - 1;
        // }
    }
} 