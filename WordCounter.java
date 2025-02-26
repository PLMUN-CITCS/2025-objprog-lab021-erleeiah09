import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("The sentence has " + sentence.trim().split("\\s+").length + " words.");
        }
        scanner.close();
    }
}