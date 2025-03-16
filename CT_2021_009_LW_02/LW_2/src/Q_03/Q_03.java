package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (In Celsius) : ");
        double celsius = scanner.nextDouble();
        double fHeit = (1.8*celsius)+32;

        System.out.println(celsius+ " celsius is equal to "+ fHeit + " fahrenheit.");
        scanner.close();
    }
}
