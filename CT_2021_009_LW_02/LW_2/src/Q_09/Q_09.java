package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment (P): ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the annual investment rate in percentage (R)-(Don't use percentage symbol): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double famount = principle*Math.pow((1+(rate/100)),years);
        System.out.println("Ater " + years + " years, your investment will grow to : " + famount);
        scanner.close();
    }
}
