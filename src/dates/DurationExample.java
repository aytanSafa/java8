package dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);

        long diffMinutes = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("Diff Minutes : "  + diffMinutes);

        Duration duration =  Duration.between(localTime,localTime1);
        System.out.println("to Minutes : "+ duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("to Minutes : " + duration1.toMinutes());
        
    }





}
