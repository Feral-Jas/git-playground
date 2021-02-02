import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTime {
    public static void main(String[] args) {
        //法一
        Date date = new Date();
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Instant       = "+instant);
        System.out.println("Date          = " + date);
        System.out.println("LocalDateTime = " + localDateTime);
        //法二
        LocalDateTime localDateTime02 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("LocalDateTime = "+localDateTime02);
    }
}
