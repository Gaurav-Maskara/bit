package com.practice.arrays;

import java.math.BigInteger;
import java.util.ArrayList;

public class AddOneToNumber {

	public static void main(String[] args) {

		AddOneToNumber addOneToNumber = new AddOneToNumber();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(0);
		
		addOneToNumber.plusOne(arrList);
		
		
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<A.size(); i++) {
			sb.append(A.get(i));
		}
		
		BigInteger bigInt = new BigInteger(sb.toString());
		bigInt = bigInt.add(new BigInteger("1"));
		
		String incrementedValueString = bigInt.toString();
		A.clear();
		for(int i = 0; i<incrementedValueString.length(); i++) {
			A.add(Integer.parseInt(Character.toString(incrementedValueString.charAt(i))));
		}
		
		return A;
		
	}

}
