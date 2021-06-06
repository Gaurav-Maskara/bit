package com.practice.binary.search;

import java.util.ArrayList;

public class SortedInsertPosition {

	public static void main(String[] args) {

		SortedInsertPosition mas = new SortedInsertPosition();

		int[] array = { 1, 3, 5, 6 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		System.out.println(mas.searchInsert(arrayList, 2));

	}

	public int searchInsert(ArrayList<Integer> a, int b) {
		int position = doBinarySearch(a, b);

		if (position != -1) {
			return position;
		}
		position = positionToInsertAt(a, b);
		return position;
	}

	public int doBinarySearch(ArrayList<Integer> list, int element) {
		int low = 0;
		int high = list.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (list.get(mid) == element) {
				return mid;
			} else if (list.get(mid) > element) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public int positionToInsertAt(ArrayList<Integer> list, int element) {
		
		if(list.get(list.size()-1) <=element) {
			return list.size();
		}
		
		if(list.get(0) > element) {
			return 0;
		}
		
		
		
		int low = 0;
		int high = list.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((list.get(mid) > element) && (list.get(mid - 1) < element)) {
				return mid;
			} else if (list.get(mid) < element) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
