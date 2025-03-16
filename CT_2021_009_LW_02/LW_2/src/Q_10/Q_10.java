package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        int monthsInYear = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Input annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan period (in years) : ");
        double loanPeriod = scanner.nextDouble();

        double monthlyinterestRate = annualInterestRate / 100.0 / monthsInYear;
        double numberOfPayment = loanPeriod * monthsInYear;
        double monthlyPayment = (loanAmount * monthlyinterestRate)/(1-Math.pow(1/(1 + monthlyinterestRate),numberOfPayment));
        double totalPayment = monthlyPayment * numberOfPayment;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n",totalPayment);

        scanner.close();


    }
}
