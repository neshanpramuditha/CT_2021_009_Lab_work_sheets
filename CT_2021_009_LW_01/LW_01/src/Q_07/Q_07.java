
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q_07 {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = now.format(formatter);

        JFrame frame = new JFrame(formattedTime);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
