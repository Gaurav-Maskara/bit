package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class SortArrayWithSquares {

	public static void main(String[] args) {
		int[] array = {-6, -3, -1, 2, 4, 5};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0 ; i<array.length; i++) {
			arrayList.add(array[i]);
		}
		SortArrayWithSquares saws = new SortArrayWithSquares();
		System.out.println(saws.solve(arrayList));
	}
	
	
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		
		ArrayList<Integer> negativeList = new ArrayList<Integer>();
		ArrayList<Integer> positiveList = new ArrayList<Integer>();
		
		ArrayList<Integer> listToReturn = new ArrayList<Integer>();
		
		
		for(int i = 0 ; i<A.size(); i++) {
			if(A.get(i)>=0) {
				positiveList.add(A.get(i));
			}else {
				negativeList.add(Math.abs(A.get(i)));
			}
		}
		
	     int j =0, k =negativeList.size()-1;
	     
	     
	     
	     while((j<positiveList.size()) || (k>=0)) {
	    	 if((j<positiveList.size() && k>=0) && positiveList.get(j)<negativeList.get(k)) {
					listToReturn.add(positiveList.get(j)*positiveList.get(j));
					j++;
				}else if(k>=0) {
					listToReturn.add(negativeList.get(k)*negativeList.get(k));
					k--;
				}	
	     }
	     
	     return listToReturn;
    }

}
