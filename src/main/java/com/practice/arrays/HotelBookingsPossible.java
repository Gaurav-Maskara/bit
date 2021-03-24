package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelBookingsPossible {

	public static void main(String[] args) {

	}

	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	
		HashMap<Integer, Integer> hotelCalendar = new HashMap<>();
		for(int i = 1; i<=31; i++) {
			hotelCalendar.put(i, 0);
		}
		
		for(int i = 0 ; i<arrive.size(); i++) {
			int j = arrive.get(i);
			int k = depart.get(i);
			for(int m = j ; m<=k; m++) {
				int guests = hotelCalendar.get(m);
				hotelCalendar.put(m, ++guests);
			}
		}
		
		for(int i = 1; i<=31; i++) {
			if(hotelCalendar.get(i)>K) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	

}
