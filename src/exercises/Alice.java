package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search:");
        String term = input.nextLine();
        int position = aliceText.toLowerCase().indexOf(term.toLowerCase());
        System.out.println(position != -1);
        int length = term.length();
        System.out.printf("Index: %d; length: %d%n", position, length);
       String newAliceText = aliceText.substring(0,position) + aliceText.substring(position + length, aliceText.length());
       System.out.println(newAliceText);
    }
}
