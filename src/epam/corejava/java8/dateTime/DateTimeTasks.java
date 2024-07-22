package epam.corejava.java8.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeTasks {

	public static void main(String[] args) {
		
		//1. Write a predicate to check if the given date is yesterday date. 
		Predicate<LocalDate> isYesterday = date-> date.equals(LocalDate.now().minusDays(1));
		System.out.println(isYesterday.test(LocalDate.now().minusDays(1)));
		System.out.println(isYesterday.test(LocalDate.now().minusDays(2)));
		System.out.println(isYesterday.test(LocalDate.now().plusDays(1)));
		
		//2. Write a Supplier to get Date for next Thursday. 
		
		Supplier<LocalDate> nextThursdaySupplier = () -> {
            LocalDate now = LocalDate.now();
            int daysUntilNextThursday = (DayOfWeek.THURSDAY.getValue() + 7 - now.getDayOfWeek().getValue()) % 7;
            return now.plusDays(daysUntilNextThursday);
        };
		
        	// Get the date for next Thursday using the Supplier
        LocalDate nextThursday = nextThursdaySupplier.get();
        
        	// Print the date for next Thursday
        System.out.println("Next Thursday's date: " + nextThursday);
        
        
        //3. Write a Supplier to get CurrentTime in EST timezone
        Supplier<LocalTime> currentTimeInESTSupplier = () -> LocalTime.now(ZoneId.of("America/New_York"));

        // Get the current time in EST using the Supplier
        LocalTime currentTimeInEST = currentTimeInESTSupplier.get();

        // Print the current time in EST
        System.out.println("Current time in EST: " + currentTimeInEST);
        
        
        //4. Write a Function to calculate the age of a person given date of birth. 
        
        LocalDate birthday = LocalDate.of(1993, 5, 13);
      
        Function<LocalDate,Period> ageFunction = date->
        	 Period.between(date, LocalDate.now());  
        	 
        Period period = ageFunction.apply(birthday);
        	 
        	 System.out.println(period.getYears()+" years and "+ period.getDays()+" months and"+period.getDays()+" days");;
		
	}

}
