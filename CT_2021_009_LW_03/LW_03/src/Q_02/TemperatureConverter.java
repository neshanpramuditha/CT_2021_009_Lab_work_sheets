package Q_02;

import java.util.Scanner;
import Q_01.Temperature;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheitInput);

        System.out.printf("%.2f°F is equivalent to %.2f°C\n",
                fahrenheitInput, temp.toCelsius());

        scanner.close();
    }
}