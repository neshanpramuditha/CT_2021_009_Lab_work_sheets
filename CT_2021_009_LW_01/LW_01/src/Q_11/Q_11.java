
import java.util.Scanner;

public class Q_11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");


        if (nameParts.length != 3) {
            System.out.println("Please enter your name in the format: First Middle Last");
        } else {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }

        scanner.close();
    }
}
