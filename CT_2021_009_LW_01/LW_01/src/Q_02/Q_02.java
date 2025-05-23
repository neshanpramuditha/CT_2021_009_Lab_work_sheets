package Q_02;

import javax.swing.*;
import java.util.Scanner;


public class Q_02{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = scanner.next();
        System.out.print("Enter your last name: ");
        String lName = scanner.next();

        JFrame frame = new JFrame();
        frame.setSize(300,250);
        frame.setTitle(fName+" "+lName);
        frame.setVisible(true);

    }
}