package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {

//		String s1 = "3";
//		String s2 = "30";
//		
//		System.out.println(s1.compareTo(s2));
		
		LargestNumber largestNumber = new LargestNumber();
		ArrayList<String> A = new ArrayList<String>();
		A.add("3");
		A.add("30");
		A.add("34");
		A.add("5");
		A.add("9");
		
		Collections.sort(A, new StringNoComaparator());
		System.out.println(A);
		
	}

	public String largestNumber(final List<Integer> A) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		long noOfZeros = 0;
		for(int i = 0; i<A.size(); i++) {
			if(A.get(i) == 0) {
				noOfZeros++;
			}
			al.add(Integer.toString(A.get(i)));
		}
		if(noOfZeros == A.size()) {
			return "0";
		}
		
		Collections.sort(al, new StringNoComaparator());
		StringBuilder largestNumber = new StringBuilder();
		
		for(int i = al.size()-1 ; i>=0; i--) {
			largestNumber.append(al.get(i));
		}
		
		return largestNumber.toString();
		
	}
	
	
	
	
	

}




class StringNoComaparator implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2) {
//		if(s1.length() == s2.length()) {
//			return (Integer.parseInt(s1)-Integer.parseInt(s2));
//		}else {
//			StringBuilder sb1 = new StringBuilder(s1+s2);
//			StringBuilder sb2 = new StringBuilder(s2+s1);
//			return (Integer.parseInt(sb1.toString())-Integer.parseInt(sb2.toString()));
//		}
//	}
	

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() == s2.length()) {
			return (s1.compareTo(s2));
		}else {
			StringBuilder sb1 = new StringBuilder(s1+s2);
			StringBuilder sb2 = new StringBuilder(s2+s1);
			return (sb1.toString().compareTo(sb2.toString()));
		}
	}

	
}




