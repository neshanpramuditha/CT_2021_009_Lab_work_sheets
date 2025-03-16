package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees fahrenheit: ");
        double fHeit = scanner.nextDouble();
        double celsius = (5.0/9.0)*(fHeit-32);

        System.out.println(fHeit + "fahrenheit is equal to " + celsius + " degrees celsius.");
        scanner.close();
    }
}
