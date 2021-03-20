package com.practice.arrays;

import java.util.ArrayList;

public class Flip {

	public static void main(String[] args) {

		Flip flip = new Flip();
		String A = "0011101";
		System.out.println(flip.flip(A));
		
	}

	public ArrayList<Integer> flip(String A) {
		
		int maxNoOfOne = 0;
		ArrayList<Integer> listToReturn = new ArrayList<Integer>();
		boolean isAllOne = true;
		
		for(int i = 0; i<A.length(); i++) {
			if(A.charAt(i)=='0') {
				isAllOne = false;
				break;
			}
		}
		
		if(isAllOne) {
			return listToReturn;
		}
		
		for(int i = 0; i<A.length(); i++) {
			for(int j = i ; j<A.length(); j++) {
				int counter = flipBitsIThroughJAndReturnOneCount(A, i, j);
				if(maxNoOfOne<counter) {
					maxNoOfOne = counter;
					listToReturn.clear();
					int posI = i+1;
					int posJ = j+1;
					listToReturn.add(posI);
					listToReturn.add(posJ);
				}
			}
		}
		
		return listToReturn;
	}
	
	public static int flipBitsIThroughJAndReturnOneCount(String a, int i, int j) {
		StringBuilder sb = new StringBuilder(a);
		int noOfOne = 0;
		for(int k= i; k<=j; k++ ) {
			if(a.charAt(k)=='0') {
			   sb.setCharAt(k, '1');
			}else {
				sb.setCharAt(k, '0');
			}
		}
		for(int k =0 ; k<sb.length(); k++) {
			if(sb.charAt(k)=='1') {
				noOfOne++;
			}
		}
		return noOfOne;
	}
	
	
}
