package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		FindDuplicateInArray findDuplicateInArray = new FindDuplicateInArray();

		int[] arr = {3,4,1,4,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(findDuplicateInArray.repeatedNumber(list));
	}

	
	public int repeatedNumber(final List<Integer> A) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Iterator<Integer> itr = A.iterator();
		
		while(itr.hasNext()) {
			int val = itr.next();
			if(!hs.add(val)) {
				return val;
			}
		}
		return -1;
	}

}
