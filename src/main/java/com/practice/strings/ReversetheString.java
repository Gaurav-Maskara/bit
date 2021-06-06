package com.practice.strings;

public class ReversetheString {

	public static void main(String[] args) {
		
		ReversetheString reversetheString = new ReversetheString();
		
        System.out.println(reversetheString.solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
	}

	public String solve(String A) {

		A = A.trim();
		String[] stringArray = A.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = stringArray.length-1; i>=0 ; i--) {
			if(stringArray[i].trim().length() == 0) {
				continue;
			}
			sb = sb.append(stringArray[i] +" ");
		}
		
		return sb.toString().trim();
	}

}
