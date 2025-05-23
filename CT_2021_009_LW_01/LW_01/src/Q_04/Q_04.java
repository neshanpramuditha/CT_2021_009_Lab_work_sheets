package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_04{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyy");

        String formattedDate=today.format(formatter);
        System.out.println("Today's Date :"+formattedDate);
    }
}