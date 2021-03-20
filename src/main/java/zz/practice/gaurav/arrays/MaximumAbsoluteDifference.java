package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {

		MaximumAbsoluteDifference mad = new MaximumAbsoluteDifference();
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(1);
		A.add(3);
		A.add(-1);
		
		System.out.println(mad.bruteForce(A));
		
	}

	public int maxArr(ArrayList<Integer> A) {
		
		
		
		
		
	}
	
	
	
	public int bruteForce(ArrayList<Integer> A) {
		
		int sum = 0;
		int temp = 0;
		
		for(int i = 0 ; i<A.size(); i++) {
			for(int j = 0 ; j<A.size(); j++) {
				temp  = Math.abs(A.get(i)-A.get(j)) + Math.abs((i+1) -(j+1));
				
				if(sum < temp) {
					sum = temp ;
				}
				temp = 0 ;
			}
		}
		return sum;
	}

}
