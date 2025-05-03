package Q_01;

import java.util.Scanner;

    public class SmallestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Your First int: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter Your Second int: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter Your Third int: ");
            int num3 = scanner.nextInt();

            int smallestNo;

            if (num1 <= num2 && num1 <= num3){
                smallestNo = num1;
            }
            else if (num2 <= num1 && num2 <= num3) {
                smallestNo = num2;
            }
            else {
                smallestNo = num3;
            }

            System.out.println("The smallest No = " + smallestNo);
            scanner.close();

            }
        }


