package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weigh in pound: ");
        double weight = scanner.nextDouble();

        double calPerPond = 19;
        double calPerDay = weight * calPerPond;

        System.out.println("You need approximately "+ calPerDay + " calories per day.");
        scanner.close();
    }
}

