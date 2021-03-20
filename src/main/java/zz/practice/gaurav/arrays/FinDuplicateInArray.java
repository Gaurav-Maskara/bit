package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jdk.nashorn.internal.runtime.FindProperty;

public class FinDuplicateInArray {

	public static void main(String[] args) {

		FinDuplicateInArray finDuplicateInArray = new FinDuplicateInArray();

		List<Integer> a = new ArrayList<Integer>();

		a.add(3);
		a.add(4);
		a.add(1);
		a.add(4);
		a.add(1);

		System.out.println(finDuplicateInArray.repeatedNumber(a));
	}

	public int repeatedNumber2(final List<Integer> A) {

		Set<Integer> set = new HashSet<Integer>();
		boolean flag = false;
		int valueThatRepeated = -1;

		for (Integer i : A) {
			flag = set.add(i);
			if (!flag) {
				valueThatRepeated = i;
				break;
			}
		}

		return valueThatRepeated;

	}

	public int repeatedNumber(final List<Integer> A) {

		int[] fre = new int[A.size()];

		for (int x : A) {
			fre[x - 1]++;

			if (fre[x - 1] > 1) {
				return x;
			}
		}

		return -1;

	}

}
