package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String args[]) {

		LargestNumber ln = new LargestNumber();

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(8);
		A.add(89);

		ln.largestNumber(A);
	}

	public String largestNumber(final List<Integer> A) {

		int[] numberSystem = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		ArrayList<String> numbersInString = new ArrayList<String>();

		for (int i : A) {
			numbersInString.add(Integer.toString(i));
		}

		Collections.sort(numbersInString, new arrSort());
		String largestNumber = "";

		for (int i = numbersInString.size() - 1; i >= 0; i--) {
			largestNumber = largestNumber + numbersInString.get(i);
		}

		if (largestNumber.charAt(0) == '0') {
			return "0";
		}
		

		return largestNumber;
	}

}

class arrSort implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		if ((o1 + o2).compareTo(o2 + o1) >= 0)
			return 1;
		return -1;
	}
}
