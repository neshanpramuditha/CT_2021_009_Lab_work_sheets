package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in Kg): ");
        int weight = scanner.nextInt();
        System.out.print("Enter your height (in cm): ");
        int height = scanner.nextInt();

        double BMI = weight / Math.pow(height/100.0,2);
        System.out.println("Your BMI value is: " + BMI);

        if (BMI >= 20 && BMI <=25){
            System.out.println("Your BMI is Normal.");
        }
        else {
            System.out.println("Your BMI is outside the normal range(20-25)!");

        }
        scanner.close();

    }
}
