package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2018,07,17);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018,365);
        System.out.println(localDate2);

        // Get Values from LocalDate
        System.out.println("Month : " + localDate.getMonth());
        System.out.println("Month value" +localDate.getMonthValue());
        System.out.println("Day of week"+localDate.getDayOfWeek());
        System.out.println("Day of Yer :" + localDate.getDayOfYear());
        System.out.println("Day of Month : " +localDate.get(ChronoField.DAY_OF_MONTH));

        // Modifying LocalDate
        System.out.println("plusDays : " +localDate.plusDays(2));
        System.out.println("plusMonth : "+ localDate.plusMonths(2));
        System.out.println("minusDays : "  + localDate.minusDays(2));
        System.out.println("withYear : "+ localDate.withYear(2019));
        System.out.println("withChronoField : "
                + localDate.with(ChronoField.YEAR,2020));
        System.out.println("withTemporalAdjusters : "
                + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("choronoUnit minus "
                + localDate.minus(1, ChronoUnit.YEARS));

        // Additional Support methods
        System.out.println("leap year : "+ localDate.isLeapYear());

        System.out.println("isEqual = "+localDate.isEqual(localDate1));
        System.out.println("isBefore = "+localDate.isBefore(localDate1));
        System.out.println("isAfter = "+localDate.isAfter(localDate1));


    }
}
