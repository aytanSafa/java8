package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+ localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022,07,23,2,22,22,65464);
        System.out.println("LocalDateTime1 : "+ localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("LocalDateTime2 : " + localDateTime2);

        // Getting the time and date From LocalDateTime instance

        System.out.println("hour : " + localDateTime.getHour());
        System.out.println("minute : " + localDateTime.getMinute());
        System.out.println("DayOfMonth : " +localDateTime.getDayOfMonth());
        System.out.println("Day_Of_Month : " +localDateTime.get(ChronoField.DAY_OF_MONTH));

        // Modifying LocalDateTime
        System.out.println("plus hours : " + localDateTime.plusHours(2));
        System.out.println("minus days : " + localDateTime.minusDays(2));
        System.out.println("withMonth : "  + localDateTime.withMonth(12));


        //converting localDate. localTime to LocalDateTime
        LocalDate localDate = LocalDate.of(2012,01,01);
        LocalDateTime localDateTime3 = localDate.atTime(23,23);
        System.out.println("atTime : " +localDateTime3);

        LocalTime localTime = LocalTime.of(23,39);
        System.out.println("atDate :  "+ localTime.atDate(LocalDate.now()));

        LocalDateTime localDateTime4 = localTime.atDate(localDate);
        System.out.println("ToLocalDate : "+ localDateTime4.toLocalDate());
        System.out.println("ToLocalTime : "+ localDateTime4.toLocalTime());

    }

}
