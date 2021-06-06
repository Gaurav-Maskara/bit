package com.practice.strings;

import java.util.HashMap;

public class IntegerToRoman {

	public static void main(String[] args) {

		IntegerToRoman integerToRoman = new IntegerToRoman();
		System.out.println(integerToRoman.intToRoman(89));
		
	}

	public String intToRoman(int A) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		
		String romanLiteral = "";
		String literal = "";
		
		while(A>0) {
			literal = getCharForNo(A);
			int noReturned = hm.get(literal);
			A = A-noReturned;
			romanLiteral = romanLiteral+literal;
		}
		return romanLiteral;
	}

	
	
	public String getCharForNo(int no) {
		
		if(no >= 1000) {
			return "M";
		}
		if(no >= 500) {
			return "D";
		}
		if(no >= 100) {
			return "C";
		}
		if(no >= 50) {
			return "L";
		}
		if(no >= 10) {
			return "X";
		}
		if(no >= 5) {
			return "V";
		}
		if(no >= 1) {
			return "I";
		}
		return "";
	}
	
	
	
	
	
}
