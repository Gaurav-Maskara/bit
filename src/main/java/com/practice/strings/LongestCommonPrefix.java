package com.practice.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		LongestCommonPrefix mas = new LongestCommonPrefix();

		String[] array = { "abcd", "abcd", "efgh" };
		ArrayList<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		System.out.println(mas.longestCommonPrefix(arrayList));

	}

	public String longestCommonPrefix(ArrayList<String> A) {
		String smallestString = "";
		String commonCharacters = "";
		int smallestStringSize = A.get(0).length();
		smallestString = A.get(0);

		for (int i = 0; i < A.size(); i++) {
			if (smallestStringSize > A.get(i).length()) {
				smallestStringSize = A.get(i).length();
				smallestString = A.get(i);
			}
		}

		// commonCharacters = Character.toString(smallestString.charAt(0));
		int counter = 0;

		while (counter < smallestStringSize) {
			char c = smallestString.charAt(counter);

			for (int i = 0; i < A.size(); i++) {
				if (c == A.get(i).charAt(counter)) {
					continue;
				} else {
					return commonCharacters;
				}
			}
			commonCharacters = commonCharacters + c;
			counter++;
		}
		return commonCharacters;
	}

}
