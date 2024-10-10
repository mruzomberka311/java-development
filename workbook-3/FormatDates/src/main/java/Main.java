import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String todayDate = currentTime.format(fmt1);
        System.out.println(todayDate);



        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        String currentDate2 = currentTime.format(fmt2);
        System.out.println(currentDate2);


        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String currentDate3 = currentTime.format(fmt3);
        System.out.println(currentDate3);


//Format for day of week, month, date, year
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("E, MMM, dd, yyyy");
        String formattedDate = currentTime.format(fmt4);
        System.out.println(formattedDate);

    }

}
