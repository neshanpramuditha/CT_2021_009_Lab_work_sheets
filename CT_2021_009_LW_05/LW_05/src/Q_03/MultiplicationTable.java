package Q_03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for print multification table: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table");
        for (int i = 1 ; i<=10; i++){

            int Multiplication = i * number;
            System.out.println(number + " x " + i + " = " + Multiplication);
        }

        scanner.close();

    }
}
