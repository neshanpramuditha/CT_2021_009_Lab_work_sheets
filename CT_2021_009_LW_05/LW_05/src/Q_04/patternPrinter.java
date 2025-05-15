package Q_04;

import java.util.Scanner;

public class patternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows, Do you want: ");
        int numOfRows = scanner.nextInt();

        for(int i = 1; i <= numOfRows; i++){
            for (int x = 1; x <= numOfRows - i; x++)//for print spaces before stars
            {
                System.out.print(" ");
            }
            for(int y = 1; y <= (2 * i - 1); y++)//for print stars
            {
                System.out.print("*");
            }
            System.out.println();//for go to next row

        }
        scanner.close();
    }
}
