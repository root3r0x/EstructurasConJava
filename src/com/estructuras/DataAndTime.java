package com.estructuras;

import java.time.LocalDate; // Import LocalDate class.
import java.time.LocalTime; // Import LocalTime class.

public class DataAndTime {

	public static void main(String[] args) {
		// TODO Display current time
		LocalDate myLD = LocalDate.now();
		LocalDate setDate = LocalDate.of(2023, 07, 20);
		
		System.out.println("Date in java");
		System.out.println("Current date is: " + myLD);
		System.out.println("Setting date is: " + setDate);
		
		//Time in Java.
		LocalTime myTime = LocalTime.now();
		
		//Hour, minute, second and nanoseconds.
		System.out.println("My local time is: " + myTime);
	}

}
