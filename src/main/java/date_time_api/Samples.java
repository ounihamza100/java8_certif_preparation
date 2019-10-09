package date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Hamza Ouni
 */
public class Samples {

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



    }

    public static void main(String[] args) {
        m();
    }
}
