package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class MaximumUnsortedSubArray {

	public static void main(String[] args) {
		MaximumUnsortedSubArray mas = new MaximumUnsortedSubArray();
		
		int[] array = {4, 15, 4, 4, 15, 18, 20};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i =0 ; i<array.length; i++) {
			arrayList.add(array[i]);
		}
		System.out.println(mas.subUnsort(arrayList));
	}
	
	
	
	public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		int start = 0;
		int end = 0;
		int j =0;
		for(int i = 0 ; i<A.size()-1; i++) {
			j = i+1;
			if(A.get(j)>A.get(i)) {
				continue;
			}else if(A.get(j)<A.get(i) && start ==0) {
				start = i;
				end = j;
			}else if(A.get(j)<A.get(i)) {
				end = j;
			}
		}   
		
		ArrayList<Integer> listToReturn = new ArrayList<Integer>();
		
		if(start ==0 && end ==0) {
			listToReturn.add(-1);
			return listToReturn;
		}
		
		listToReturn.add(start);
		listToReturn.add(end);
		return listToReturn;
    }

}
