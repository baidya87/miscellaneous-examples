package com.baidya.io.read;

import java.util.Arrays;

public class ApplicationRunner {

	public static void main(String[] args) {
		for (Sports sport : Sports.values()) {
			System.out.println(sport.getCode());
		}
		
		System.out.println("Code: "+Sports.BADMINTON.getCode());
		System.out.println();
		Sports football = Sports.valueOf("FOOTBALL");
		System.out.println(football);
		
		System.out.println("football.name(): "+football.name());
		
		// comparing the enums
		
		System.out.println("Comparing CRICKET with BADMINTON >> returns positive natural order sorting"+Sports.CRICKET.name().compareTo(Sports.BADMINTON.name()));
		System.out.println("Comparing by code >> returns -ive because of value: "+ Sports.CRICKET.compareTo(Sports.BADMINTON));
		
		//System.out.println(Sports.FOOTBALL.compareTo(Sports.CRICKET));
		
		//Sorting ENUMs by names.
		Sports[] sports = Sports.values();
		for (Sports sport : sports) {
			System.out.printf("%s ",sport);
		}
		
		System.out.println("\n****After sorting****");
		Arrays.sort(sports, (s1, s2) -> s1.name().compareTo(s2.name()));
		for (Sports sport : sports) {
			System.out.printf("%s ",sport);
		}
		System.out.println();
		System.out.println("Ordinal value : "+Sports.HORSERIDING.ordinal());
		
	}
}
