package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;


public class NobleInteger {

	public static void main(String[] args) {

		NobleInteger nobleInteger = new NobleInteger();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(3);
		
	    System.out.println(nobleInteger.solve(A));
		
	}
	
	
	
	public int solve(ArrayList<Integer> A) {
		
		Collections.sort(A);
		
		
		for(int i = 0 ; i<A.size(); i++) {
			if(i!=A.size()-1 && A.get(i) ==A.get(i+1)) {
				continue;
			}
			
			int number = A.get(i);
			if(A.size()-1-i == number) {
				return 1;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	

}
