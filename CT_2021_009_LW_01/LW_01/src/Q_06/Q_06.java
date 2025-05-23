import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the frame title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the frame width (W): ");
        int width = scanner.nextInt();

        System.out.print("Enter the frame height (H): ");
        int height = scanner.nextInt();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        scanner.close();
    }
}
