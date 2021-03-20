package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class MaxMin {

	public static void main(String[] args) {

		MaxMin mm = new MaxMin();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(-2);
		arrayList.add(1);
		arrayList.add(-4);
		arrayList.add(5);
		arrayList.add(3);


		System.out.println(mm.solve(arrayList));
		
		
		
		
	}

	public int solve(ArrayList<Integer> A) {
		
		if(A == null || A.size()==0) {
			return 0;
		}
		
		long min = A.get(0);
		long max = A.get(0);
		
		for(Integer i : A) {
			
			if(min > i) {
				min = i;
			}
			
			if(max < i) {
				max = i;
			}
		}
		return (int) (max+min);
	}

}
