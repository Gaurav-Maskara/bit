package com.practice.strings;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public class PalindromeString {

	public static void main(String[] args) {

//		System.out.println((int)'a');
//		System.out.println((int)'z');
//		System.out.println((int)'A');
//		System.out.println((int)'Z');
//		System.out.println((int)'0');
//		System.out.println((int)'9');
		
		PalindromeString palindromeString = new PalindromeString();
		System.out.println(palindromeString.isPalindrome("race a car"));
		
		
		
	}

	public int isPalindrome(String A) {
		
		int firstPointer = 0;
		int secondPointer = A.length()-1;
		String b = A;
		
		
		while((firstPointer < A.length()) && (secondPointer >= 0)) {
			
			char firstChar = A.charAt(firstPointer);
			char secondChar = b.charAt(secondPointer);
			
			if(!Character.isLetterOrDigit(firstChar)) {
				firstPointer++;
			}else {
				if(!Character.isLetterOrDigit(secondChar)) {
					secondPointer--;
				}else {
					
					if(!(Character.toLowerCase(firstChar)==Character.toLowerCase(secondChar))) {
						return 0;
					}else {
						firstPointer++;
						secondPointer--;
					}
				}
			}
		}
		return 1;
	}

}
