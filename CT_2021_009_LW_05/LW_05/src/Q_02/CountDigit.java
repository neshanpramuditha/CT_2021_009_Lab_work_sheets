package Q_02;

import java.util.Scanner;

public class CountDigit {
   public static int CountDig (int number) {
       if (number == 0) {
           return 1;
       }
       int count = 0;
       number = Math.abs(number);

       while (number > 0){
           count++;
           number /= 10;
       }
       return count;

   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter an integer [Please don't enter negative numbers]:");
            int input = scanner.nextInt();

            if (input<0){
                System.out.println("---Programme Terminated---");
                break;
            }
            int digitCounter = CountDig(input);
            System.out.println(input + " has " + digitCounter + " no of digits");
        }
        scanner.close();
    }
}
