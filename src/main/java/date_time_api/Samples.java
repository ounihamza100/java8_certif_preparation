package date_time_api;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * @author Hamza Ouni
 */
public class Samples {


    //==================== The LocalDate represents a date in ISO format (yyyy-MM-dd) without time =========================
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     *
     * The {@link LocalDate} represents a date in ISO format (yyyy-MM-dd) without time.
     */
    LocalDate localDate = LocalDate.now();//An instance of current date

    //LocalDate representing a specific day,month and year can be obtained using the “of” method
    // or by using the “parse” method

    static void m(){
        LocalDate.of(2015, 02, 20);
        LocalDate.parse("2015-02-20");
        //gets the current local date and adds one day
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        //This example obtains the current date and subtracts one month. Note how it accepts an enum as the time unit:
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        //parse the date and get day of the week
        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        //get day of the month
        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();

        //test if date occurs in a lep year (سنة كبيسة) In this example we test if the current date occurs is a leap year
        boolean leapYear = LocalDate.now().isLeapYear();


        //The relationship of a date to another can be determined to occur before or after another date
        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("notBefore:"+notBefore);

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("isAfter:"+isAfter);


        //Date boundaries can be obtained from a given date.

        //get the LocalDateTime that represents the beginning of the day (2016-06-12T00:00) of the given date
        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("beginningOfDay : "+beginningOfDay);

        //LocalDate that represents the beginning of the month (2016-06-01)
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth : "+firstDayOfMonth);


        //==================== LocalTime represents time without a date =========================
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        LocalTime now = LocalTime.now();

        // create a LocalTime representing 06:30 AM by parsing a string representation
        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("sixThirty : "+sixThirty);

        LocalTime sixThirty_using_factory_method = LocalTime.of(6, 30);

        // creates a LocalTime by parsing a string and adds an hour to it by using the “plus” API.
        // The result would be LocalTime representing 07:30 AM
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);

        //
        int six = LocalTime.parse("06:30").getHour();

        //check if a specific time is before or after another specific time
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        //Max , Min and Noon
        LocalTime maxTime = LocalTime.MAX;
        LocalTime minTime = LocalTime.MIN;
        LocalTime noonTime = LocalTime.NOON;

        System.out.println("maxTime :"+maxTime);
        System.out.println("minTime :"+minTime);
        System.out.println("noonTime :"+noonTime);

        //==================== The LocalDateTime is used to represent a combination of date and time =========================
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");
        localDateTime.plusDays(1);
        localDateTime.minusHours(2);
        localDateTime.getMonth();

        //==================== Using ZonedDateTime API =========================
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Java 8 provides ZonedDateTime when we need to deal with time zone specific date and time.
        // The ZoneId is an identifier used to represent different zones.
        // There are about 40 different time zones and the ZoneId are used to represent them as follows.

        //In this code snippet we create a Zone for Paris
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId : "+zoneId);

        //A set of all zone ids
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();


        //LocalDateTime can be converted to a specific zone:
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        //====================  Using Period and Duration =======================================
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //The Period class represents a quantity of time in terms of years, months and days and
        // the Duration class represents a quantity of time in terms of seconds and nano seconds.

        //The Period class is widely used to modify values of given a date or to obtain the difference between two dates
        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        int five = Period.between(finalDate, initialDate).getDays();
        long fivee = ChronoUnit.DAYS.between(finalDate , initialDate);












    }

    public static void main(String[] args) {
        m();
    }
}
