package com.practice.binary.search;


import java.util.ArrayList;
import java.util.List;

public class SearchForRange {

	public static void main(String[] args) {
		SearchForRange mas = new SearchForRange();
		int[] array = { 5, 7, 7, 8, 8, 10};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		System.out.println(mas.searchRange(arrayList, 8));

	}

	public ArrayList<Integer> searchRange(final List<Integer> A, int B) {

		ArrayList<Integer> listToReturn = new ArrayList<>();

		listToReturn.add(doBinarySearch(A, B, true));
		listToReturn.add(doBinarySearch(A, B, false));
		
		return listToReturn;
	}

	public int doBinarySearch(List<Integer> list, int element, boolean isFirst) {
		int low = 0;
		int high = list.size()-1;
		int index = -1;
		
		while (low <= high) {
			int mid = (low + high) / 2;

			if (list.get(mid) == element) {
				index = mid;
				
				if(isFirst) {
					high = mid-1;
				}else {
					low = mid+1;
				}
				
			} else if (list.get(mid) > element) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return index;
	}

}
