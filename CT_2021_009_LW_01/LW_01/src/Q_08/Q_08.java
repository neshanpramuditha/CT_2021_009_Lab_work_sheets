package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing a exclamation mark: ");
        String input = scanner.nextLine();
        int index = input.indexOf('!');

        if (index != -1){
            String before = input.substring(0,index);
            String after = input.substring(index+1);

            System.out.println("Before: "+ before);
            System.out.println("After: "+ after);
        }
        else{
                System.out.print("No exclamation mark found in the input.");
            }
        scanner.close();
        }
    }

