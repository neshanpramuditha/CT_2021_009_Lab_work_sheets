package Q_04;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year here: ");
        int Yer = scanner.nextInt();

        if((Yer % 4 == 0 && Yer % 100 != 0) || (Yer % 400 == 0)){
            System.out.println(Yer + " is a leap year.");
        }
        else {
            System.out.println(Yer + " is not a leap year.");
        }
        scanner.close();
    }
}
