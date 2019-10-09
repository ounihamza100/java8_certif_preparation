package date_time_api;

/**
 * @author Hamza Ouni
 */
public class Doc {

    /**
     *
     * Java 8 introduced new APIs for Date and Time to address the shortcomings of the older java.util.Date and java.util.Calendar.
     *
     * As part of this article, let's start with the issues in the existing Date and Calendar APIs
     * and let's discuss how the new Java 8 Date and Time APIs address them.
     *
     *
     * We will also look at some of the core classes of the new Java 8 project that are part of the java.time package
     * like LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration and their supported APIs.
     *
     *
     *
     *
     */

    /**
     *
     * Issues with the Existing Date/Time APIs :
     *
     * Thread Safety : The Date and Calendar classes are not thread safe,leaving developers to deal with the headache
     * of hard to debug concurrency issues and to write additional code to handle thread safety.
     * On the contrary the new Date and Time APIs introduced in Java 8 are immutable and thread safe,
     * thus taking that concurrency headache away from developers.
     *
     * APIs Design and Ease of Understanding :  The Date and Calendar APIs are poorly designed with inadequate methods
     * to perform day-to-day operations. The new Date/Time APIs is ISO centric and follows consistent domain models for date,
     * time, duration and periods.There are a wide variety of utility methods that support the commonest operations.
     *
     * ZonedDate and Time :  Developers had to write additional logic to handle timezone logic with the old APIs,
     * whereas with the new APIs, handling of timezone can be done with Local and ZonedDate/Time APIs.
     *
     *
     */
}

