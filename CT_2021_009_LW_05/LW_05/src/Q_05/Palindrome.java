package Q_05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word oe phrase here: ");
        String input = scanner.nextLine();

        String CleanInput = input.replaceAll("[^a-z A-Z 0-9]","").toLowerCase();//for Removing Spaces
        String Reverse = new StringBuilder(CleanInput).reverse().toString();//for reverse the phrase or word

        if (CleanInput.equals(Reverse)){  //for check if it is palindrome?
            System.out.println("'" + input + "'" + " is palindrome");
        }
        else {
            System.out.println("'" + input + "'" + " is not palindrome");
        }

    scanner.close();
    }


}
