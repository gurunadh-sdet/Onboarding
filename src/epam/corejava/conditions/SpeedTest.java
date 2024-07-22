package epam.corejava.conditions;
//1. You are driving a little too fast, and a police officer stops you. 
//Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
//If speed is 81 or more, the result is 2. 
//Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

import java.time.LocalDate;

public class SpeedTest {

	public static void main(String[] args) {
		
	int noTicket =0;
	int smallTicket =1;
	int bigTicket =2;
	
	
	//int speed=70;
	
	LocalDate today =  LocalDate.now();
	System.out.println(today);
	LocalDate birthday = LocalDate.of(1991, 10, 16);
	boolean isBirthDay = isBirthday(today, birthday);
    System.out.println("Result: " + calculateSpeed(70, isBirthDay));
    System.out.println("Result: " + calculateSpeed(60, false));
    System.out.println("Result: " + calculateSpeed(65, false));
    System.out.println("Result: " + calculateSpeed(65, true));

    
	}
	
	public static boolean isBirthday(LocalDate today, LocalDate birthday) {
		return birthday.getMonthValue()==today.getMonthValue() && birthday.getDayOfMonth()==today.getDayOfMonth();
	}
	
	public static int calculateSpeed(int speed, boolean isBirthday) {
		int maxSpeed =0;
		if(isBirthday) {
			maxSpeed =5;
		}
		  if (speed <= 60 + maxSpeed) {
	            return 0;
	        } else if (speed <= 80 + maxSpeed) {
	            return 1;
	        } else {
	            return 2;
	        }
	}

	

}
