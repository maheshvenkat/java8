import java.time.*;

public class TravelTimeCalculator {

   /* public Duration calculateTravelTime(ZonedDateTime departure,ZonedDateTime arrival) {
        return Duration.between(departure, arrival);
    }
    */

    public static void main(String[] args) {
        TravelTimeCalculator travelTime = new TravelTimeCalculator();
        ZonedDateTime departure1 = ZonedDateTime.of(LocalDateTime.of(2014, Month.MARCH,8,8,0), ZoneId.of("America/Denver"));
        ZonedDateTime arrival1 = ZonedDateTime.of(LocalDateTime.of(2014,Month.MARCH,9,8,0),ZoneId.of("America/Toronto"));

        Duration period = calculateTravelTime(departure1, arrival1);
        System.out.println("Duration of travel from Denver to Toronto is "+period.toHours() +" hours");
    }

    private static Duration calculateTravelTime(ZonedDateTime departure1, ZonedDateTime arrival1) {
        return Duration.between(departure1, arrival1);
    }
}
