import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class DateAndTimeZoneDemo {

    public static void main(String[] args) {
       /* Set<String> allZoneId = ZoneId.getAvailableZoneIds();

        List<String> zoneIdList = new ArrayList<>(allZoneId);
        Collections.sort(zoneIdList);

        for(String zoneId: zoneIdList ) {
            System.out.println(zoneId);
        }
        */

        ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);

    }
}
