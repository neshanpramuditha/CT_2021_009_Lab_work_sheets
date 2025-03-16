package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length in cm: ");
        double cm = scanner.nextDouble();
        
        double cmPerInch = 2.54;
        double inchPerFeet = 12;

        double totalInches = cm/cmPerInch;

        int feet = (int)(totalInches/inchPerFeet);
        double inches = totalInches % inchPerFeet;

        System.out.println(cm + " cm is equal to " + feet + " feet and " + inches + " inches.");
        scanner.close();

                 



    }
}
