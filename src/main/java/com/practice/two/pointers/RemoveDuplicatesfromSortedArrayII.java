package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {

		RemoveDuplicatesfromSortedArrayII main = new RemoveDuplicatesfromSortedArrayII();
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2));
		
		System.out.println(main.removeDuplicates(list));
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
			} else if (noOfDuplicates >= 2) {
				int i;
				int remover = pointerA + 1;
				for (i = pointerA + 2; i < pointerB; i++) {
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

		if (noOfDuplicates >= 2) {
			int i;
			int remover = pointerA + 1;
			for (i = pointerA + 2; i < pointerB; i++) {
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
