package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int length = input.length();

        if(length>0){
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(length - 1);

            System.out.println(length);
            System.out.println(firstChar);
            System.out.println(lastChar);

        }
        else {
            System.out.println("The input string is empty.");

        }
        scanner.close();

    }
}
