package java8fea;

import java.time.*;
import java.time.format.DateTimeFormatter;



public class Java8DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate specificDate = LocalDate.of(2023, 10, 15);
        System.out.println(specificDate);
        LocalDate parsedDate = LocalDate.parse("2023-10-15");
        System.out.println(parsedDate);

        LocalDate futureDate = date.plusDays(10);
        System.out.println(futureDate);
        LocalDate pastDate = date.minusMonths(3);
        System.out.println(pastDate);
        LocalDateTime newDateTime = dateTime.plusHours(5);
        System.out.println(newDateTime);
        LocalTime cur=time.plusHours(2);
        System.out.println(cur);
        
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(cur.format(dateTimeFormatter));
        
        

        int year = date.getYear();
        System.out.println(year);
        int day = date.getDayOfMonth();
        System.out.println(day);
    }
}