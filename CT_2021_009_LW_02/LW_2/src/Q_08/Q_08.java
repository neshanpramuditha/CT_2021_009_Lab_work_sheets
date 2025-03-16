package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        double PI = 3.14;
        double volume = (4/3) * (PI * Math.pow(radius,3));

        System.out.println("Volume of the sphere: " + volume);
        scanner.close();

    }
}
