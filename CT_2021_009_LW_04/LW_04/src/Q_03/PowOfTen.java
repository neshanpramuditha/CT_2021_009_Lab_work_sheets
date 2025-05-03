package Q_03;

import java.util.Scanner;

public class PowOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power of 10 (e.g - 6,9,12,15,18,21,30,100) : ");
        int powOf10 = scanner.nextInt();


        switch (powOf10){
            case 6:
                System.out.println("The number is Million");
                break;
            case 9:
                System.out.println("The number is Billion");
                break;
            case 12:
                System.out.println("The number is Trillion");
                break;
            case 15:
                System.out.println("The number is Quadrillion");
                break;
            case 18:
                System.out.println("The number is Quintillion");
                break;
            case 21:
                System.out.println("The number is Sextillion");
                break;
            case 30:
                System.out.println("The number is Nonillion");
                break;
            case 100:
                System.out.println("The number is Googol");
                break;
            default:
                System.out.println("There is no standard name for 10 to the power of " + powOf10);

        }
    scanner.close();
    }
}
