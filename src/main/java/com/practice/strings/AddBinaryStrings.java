package com.practice.strings;

public class AddBinaryStrings {

	public static void main(String[] args) {
		
		AddBinaryStrings addBinaryStrings = new AddBinaryStrings();
		System.out.println(addBinaryStrings.addBinary("1", "1"));

	}

	public String addBinary(String A, String B) {
		while(A.length() < B.length()) {
			A = "0"+A;
		}
		while(B.length() < A.length()) {
			B = "0"+B;
		}
		
		String binarySum = "";
		String temp = "";
		String carryChar = "";
		
		int counter = A.length()-1;
		while(counter >= 0) {
			char c1 = A.charAt(counter);
			char c2 = B.charAt(counter);
			counter--;
			temp = Character.toString(c1)+Character.toString(c2)+carryChar;
			
			if(temp.contains("111")) {
				binarySum = "1"+binarySum;
				carryChar = "1";
			}else if(temp.contains("11") || temp.contains("101") ) {
				binarySum = "0"+binarySum;
				carryChar = "1";
			}else if(temp.contains("1") && temp.contains("0")) {
				binarySum = "1"+binarySum;
				carryChar = "";
			}else {
				binarySum = "0"+binarySum;
				carryChar = "";
			}
		}
		if(carryChar.length() != 0) {
			binarySum = carryChar+binarySum;
		}
		
		return binarySum;
	}

}
