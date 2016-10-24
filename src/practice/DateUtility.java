package practice;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * The purpose of this class is to perform general date and time calculations.
 *
 * @author Gerardo
 */
public class DateUtility {

    /**
     * DEFAULT CONSTRUCTOR
     */
    public DateUtility() {
    }
    
    private DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern(
            "MMMM d,yyyy");

    /**
     * Returns a STRING of the current date and time in the following format
     * MonthName Day, Year
     *
     * @return String
     */
    final public String getDate() {
        LocalDateTime date = LocalDateTime.now();
        String strDate = date.format(formattedDate);
        return strDate;
    }

    /**
     * Takes in a STRING date in the following format YYYY-MM-DD formats it and
     * returns it as a string (formatted)
     *
     * @param date
     * @return String - Formatted
     */
    final public String stringToDate(String date) {
        LocalDate processedDate = LocalDate.parse(date);
        return processedDate.format(formattedDate);
    }
    
    
    /**
     * Takes in two LocalDate objects, and returns or prints the difference
     * in days or hrs, or minutes
     * 
     * @param startDate
     * @param endDate 
     */
    final public void differenceInDays(LocalDate startDate, LocalDate endDate) {
        Duration differenceInDays = Duration.between(startDate, endDate);
        long hrs = differenceInDays.toHours();
        long min = differenceInDays.toMinutes() % 60;
        long days = differenceInDays.toDays();
//        System.out.println("Hours: " + hrs + ", Minutes: " + min);
//        return hrs;
    }

    final public static void main(String[] args) {
        DateUtility date = new DateUtility();
        LocalDate date1 = LocalDate.of(2010, Month.SEPTEMBER, 9);
        LocalDate date2 = LocalDate.now();
        String date3 = "2010-01-10";
        
        System.out.println(date.getDate());
//        System.out.println(date.differenceInDays(date1, date2));
//        date.differenceInDays(date1, date2);
        System.out.println(date.stringToDate(date3));
        
    }
}
