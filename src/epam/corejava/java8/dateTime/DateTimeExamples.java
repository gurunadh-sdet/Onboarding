package epam.corejava.java8.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeExamples {

	public static void main(String[] args) {
		//1. Write a predicate to check if the given date is yesterday date. 
		LocalDate date = LocalDate.now();
		System.out.println("Day is "+date.getDayOfMonth());
		System.out.println("month is "+date.getMonthValue());
		System.out.println("year is "+date.getYear());
		
		LocalTime time = LocalTime.now();
		System.out.println("HOurs is: "+time.getHour());
		System.out.println("MInutes is: "+time.getMinute());
		System.out.println("Seconds are: "+time.getSecond());
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println(zone.getId());
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		
		
		LocalDate today =LocalDate.now();
		LocalDate birthday = LocalDate.of(1991, 10, 16);
		Period period = Period.between(birthday, today);
		System.out.println("The Age is "+period.getYears()+" years"+period.getMonths()+" Months"+period.getDays()+" days");
			
		
	}

}
