package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.print("Select one color from the above list : ");

        int Selection = scanner.nextInt();

        switch (Selection){
            case 0:
                System.out.println("You select Magenta");
                break;
            case 1:
                System.out.println("You select Cyan");
                break;
            case 2:
                System.out.println("You select Red");
                break;
            case 3:
                System.out.println("You select Blue");
                break;
            case 4:
                System.out.println("You select Green");
                break;
            default:
                System.out.println("Invalid selection !");
        }
        scanner.close();

    }
}
