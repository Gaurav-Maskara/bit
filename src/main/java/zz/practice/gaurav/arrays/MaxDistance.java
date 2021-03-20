package zz.practice.gaurav.arrays;

import java.util.List;

public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public int maximumGap(final List<Integer> A) {
		
		int maximumGap = 0;
		int temp = 0;
		for(int i = 0 ; i<A.size()-1; i++) {
			for(int j = i+1; j<A.size(); j++) {
				if(A.get(i)<=A.get(j)) {
					temp = j-i;
				}
				if(maximumGap<temp) {
					maximumGap = temp;
				}
			}
		}
		
		return maximumGap;
		
    }

}
