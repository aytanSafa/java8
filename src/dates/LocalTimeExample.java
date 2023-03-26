package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : " +localTime);

        LocalTime localTime1 = LocalTime.of(23,33);
        System.out.println("localTime1 :" +localTime1);

        LocalTime localTime2 = LocalTime.of(23,33,33);
        System.out.println("localTime2 :" +localTime2);

        LocalTime localTime3 = LocalTime.of(23,33,33,90626);
        System.out.println("localTime3 : " + localTime3);


        // getting localtime values

        System.out.println("getHour :" +localTime.getHour());
        System.out.println("getMinute :" +localTime.getMinute());
        System.out.println("getSecond : " +localTime.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("CLOCK_HOUR_OF_DAY : "
                + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));

        // Modify values of LocalTime

        System.out.println("minusHours : " + localTime.minusHours(2));
        System.out.println("ChronoUnit.hours : "
                + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("Midnight.with : "
                + localTime.with(LocalTime.MIDNIGHT));

        System.out.println("HOUR_OF_DAY.with : "
                + localTime.with(ChronoField.HOUR_OF_DAY,3));




    }
}
