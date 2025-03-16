package Q_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Q_01 - part (a)
        System.out.print("Enter vslue of A,B and C: ");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double resultofA = Math.sqrt(Math.pow(B,2)+4*A*C);
        System.out.println("Result (A): " + resultofA);

        //Q_01 - part (b)
        System.out.print("Enter value of X and Y: ");
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        double resultofB = Math.sqrt(X+4*(Math.pow(Y,3)));
        System.out.println("This is the result: " + resultofB);

        //Q_01 - part (c)
        double productResult = Math.cbrt(X * Y);
        System.out.println("The cube root of the product of X & Y: " + productResult);

        //Q_01 - part (d)
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of the circle: " + area);

        scanner.close();



    }
}
