package Q_03;

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name-: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name-: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name-: ");
        String lastName = scanner.nextLine();

        String middleInitial = middleName.substring(0, 1) + ".";

        System.out.println("Formatted Name: " + firstName + " " + middleInitial + " " + lastName);
        scanner.close();
    }
}
