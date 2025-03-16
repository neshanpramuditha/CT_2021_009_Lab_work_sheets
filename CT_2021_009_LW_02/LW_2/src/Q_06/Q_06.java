package Q_06;

import java.time.Year;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your You Born: ");
        int birthYear = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Year were born in "+ birthYear + " and will be (are) " + age + " this year.");
        scanner.close();
    }
}
