package Q_06;

import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        int GuessedNumber = (int) (Math.random() * 100) + 1 ;
        Scanner scanner = new Scanner(System.in);

        int Guess = 0;
        int NoOfTries = 0;

        System.out.println("'I am thinking of a number beween 1 and 100'");
        System.out.println("'Can you guess what the number ?'");

        while (Guess != GuessedNumber ){
            System.out.print(" What is your guess? : ");
            Guess = scanner.nextInt();
            NoOfTries++;

            if (Guess < GuessedNumber){
                System.out.println("Too low!, Try again.");
            }
            else if (Guess > GuessedNumber) {
                System.out.println("Too high!, Try again.");
            }
            else {
                System.out.println("Your guess is right! , Guess it in after" + NoOfTries + " tries.");
            }
        }
        scanner.close();
    }
}
