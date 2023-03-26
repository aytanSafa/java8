package dates;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);

        System.out.println("ZonedOffSet : "  + zonedDateTime.getOffset());

        System.out.println("Zone Id : " +zonedDateTime.getZone());
        /*ZoneId.getAvailableZoneIds()
                .stream()
                .forEach((zone) -> System.out.println(zone));
        */
        System.out.println("No of Zones :" + ZoneId.getAvailableZoneIds().size());

    }

}
