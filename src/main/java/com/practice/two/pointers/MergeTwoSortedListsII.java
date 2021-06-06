package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedListsII {

	public static void main(String[] args) {

		MergeTwoSortedListsII mergeTwoSortedListsII = new MergeTwoSortedListsII();

		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

		mergeTwoSortedListsII.merge(a, b);

	}

	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

		int pointerA = a.get(0);
		int pointerB = b.get(0);

		int counterA = 0;
		int counterB = 0;

		ArrayList<Integer> listToReturn = new ArrayList<>();

		while (listToReturn.size() != (a.size() + b.size())) {

			if ((counterA < a.size()) && (counterB < b.size()) || ((counterA < a.size()) && (counterB == b.size()))) {
				if ((counterA < a.size()) && (counterB < b.size())) {
					pointerA = a.get(counterA);
					pointerB = b.get(counterB);

					if (pointerA <= pointerB) {
						listToReturn.add(pointerA);
						counterA++;
					} else {
						listToReturn.add(pointerB);
						counterB++;
					}
				} else if ((counterA < a.size()) && (counterB == b.size())) {
					pointerA = a.get(counterA);
					listToReturn.add(pointerA);
					counterA++;
				}
			} else if ((counterB < b.size()) && (counterA < a.size())
					|| ((counterB < b.size()) && (counterA == a.size()))) {
				if ((counterB < b.size()) && (counterA < a.size())) {
					pointerA = a.get(counterA);
					pointerB = b.get(counterB);

					if (pointerB <= pointerA) {
						listToReturn.add(pointerB);
						counterB++;
					} else {
						listToReturn.add(pointerA);
						counterA++;
					}
				} else if ((counterB < b.size()) && (counterA == a.size())) {
					pointerB = b.get(counterB);
					listToReturn.add(pointerB);
					counterB++;
				}
			}
		}

		System.out.println(listToReturn);
		a = listToReturn;
		System.out.println(a);

	}

}
