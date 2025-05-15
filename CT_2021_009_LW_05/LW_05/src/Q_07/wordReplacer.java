package Q_07;

import java.util.Scanner;

public class wordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced : ");
        String ThewordtobeChanged = scanner.nextLine();

        System.out.print("Enter the replacement word : ");
        String replacementWord = scanner.nextLine();

        String updatedSentence = sentence.replaceAll("\\b" + ThewordtobeChanged + "\\b", replacementWord);

        System.out.print("Updated Sentence -> " + updatedSentence);

        scanner.close();


    }
}
