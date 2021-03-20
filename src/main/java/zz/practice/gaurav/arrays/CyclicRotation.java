package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class CyclicRotation {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		int b = 56;

		a.add(14);
		a.add(5);
		a.add(14);
		a.add(34);
		a.add(42);
		a.add(63);
		a.add(17);
		a.add(25);
		a.add(39);
		a.add(61);
		a.add(97);
		a.add(55);
		a.add(33);
		a.add(96);
		a.add(62);
		a.add(32);
		a.add(98);
		a.add(77);
		a.add(35);

		CyclicRotation cr = new CyclicRotation();
		System.out.println(cr.rotateArray(a, b));

	}

	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		B = B%A.size();
		
		for (int i = B; i < A.size(); i++) {
			ret.add(A.get(i));
		}

		for (int i = 0; i < B; i++) {
			ret.add(A.get(i));
		}
		return ret;
	}

	
	
}
