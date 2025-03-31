package Q_04;
import java.util.Scanner;

public class BicycleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter owner's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter owner's phone number: ");
        String phoneNo = scanner.nextLine();

        // Creating Bicycle object with Owner details
        Bicycle myBike = new Bicycle(name, phoneNo);

        // Display Bicycle details
        myBike.displayBicycleInfo();

        scanner.close();
    }
}
