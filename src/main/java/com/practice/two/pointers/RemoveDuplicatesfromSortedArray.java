package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
		System.out.println(removeDuplicatesfromSortedArray.removeDuplicates(list));

	}

	public int removeDuplicates(ArrayList<Integer> a) {

		int pointerA = 0;
		int pointerB = 1;
		int noOfDuplicates = 0;

		while (pointerB < a.size()) {
			int valueA = a.get(pointerA);
			int valueB = a.get(pointerB);

			if (valueA == valueB) {
				pointerB++;
				noOfDuplicates++;
			} else if (noOfDuplicates > 0) {
				int i;
				int remover = pointerA + 1;
				for (i = pointerA + 1; i < pointerB; i++) {
					a.remove(remover);
				}

				noOfDuplicates = 0;
				pointerA = pointerA + 1;
				pointerB = pointerA + 1;
			} else {
				pointerA++;
				pointerB++;
			}
		}

		if (noOfDuplicates > 0) {
			int i;
			int remover = pointerA + 1;
			for (i = pointerA + 1; i < pointerB; i++) {
				a.remove(remover);
			}

			noOfDuplicates = 0;
			pointerA = pointerA + 1;
			pointerB = pointerA + 1;
		}

		//System.out.println(a);
		return a.size();
	}

}
