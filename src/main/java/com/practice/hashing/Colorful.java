package com.practice.hashing;

import java.util.HashSet;

public class Colorful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int colorful(int A) {
		String B = Integer.toString(A);
		HashSet<Integer> set = new HashSet<Integer>();
		int prod = 0;
		for (int i = 0; i < B.length(); i++) {
			prod = 1;
			for (int j = i; j < B.length(); j++) {
				prod *= Character.getNumericValue(B.charAt(j));
				if (set.contains(prod))
					return 0;
				else
					set.add(prod);
			}
		}
		return 1;
	}

}
