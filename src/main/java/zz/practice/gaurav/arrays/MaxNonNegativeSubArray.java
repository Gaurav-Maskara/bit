package zz.practice.gaurav.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MaxNonNegativeSubArray {

	public static void main(String args[]) {
		
		MaxNonNegativeSubArray mn = new MaxNonNegativeSubArray();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(0);
		arr.add(0);
		arr.add(-1);
		arr.add(0);
		
		
		System.out.println(mn.maxset(arr));
		

	}
	
	
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {

		int length = A.size();
		ArrayList<SubArrayClass> allSubArrayList = new ArrayList<MaxNonNegativeSubArray.SubArrayClass>();
		
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 0 ; i<length; i ++) {
			if(A.get(i)>=0) {
				sum = sum.add(BigInteger.valueOf(A.get(i)));
				temp.add(A.get(i));
			}else {
				if(temp.size()>0) {
					allSubArrayList.add(new SubArrayClass(sum, temp));
					sum = BigInteger.ZERO;
					temp = new ArrayList<Integer>();
				}
				continue;
			}
		}
		
		if(temp.size()>0) {
			allSubArrayList.add(new SubArrayClass(sum, temp));
			sum = BigInteger.ZERO;
			temp = new ArrayList<Integer>();
		}
		
		ArrayList<Integer> subArrayToReturn = new ArrayList<Integer>();
		
		if(allSubArrayList.size()>0) {
			
			int allSubArrayListLength = allSubArrayList.size();
			sum = BigInteger.ZERO;
			int biggestSubArrayLength = 0;
			
			for(SubArrayClass b : allSubArrayList) {
				
				if ((sum.compareTo(b.sum) == -1)
						|| (sum.compareTo(b.sum) == 0 && biggestSubArrayLength <= b.subArray.size())) {
					sum = b.sum;
					biggestSubArrayLength = b.subArray.size();
					subArrayToReturn = b.subArray;
				}
			}
			
		}
		return subArrayToReturn;
	}
	
	
	static class SubArrayClass{
		
		 BigInteger sum = BigInteger.ZERO;
		 ArrayList<Integer> subArray = new ArrayList<Integer>();
		 
		 public SubArrayClass(BigInteger sum, ArrayList<Integer> subArray) {
			 this.sum = sum;
			 this.subArray = subArray;
		 }
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public ArrayList<Integer> maxset2(ArrayList<Integer> A) {

		int length = A.size();
		HashMap<BigInteger, ArrayList<Integer>> allSubArray = new HashMap<BigInteger, ArrayList<Integer>>();
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 0 ; i<length; i ++) {
			if(A.get(i)>=0) {
				sum = sum.add(BigInteger.valueOf(A.get(i)));
				temp.add(A.get(i));
			}else {
				if(temp.size()>0) {
					allSubArray.put(sum, temp);
					sum = BigInteger.ZERO;
					temp = new ArrayList<Integer>();
				}
				continue;
			}
		}
		
		if(temp.size()>0) {
			allSubArray.put(sum, temp);
			sum = BigInteger.ZERO;
			temp = new ArrayList<Integer>();
		}
		
		ArrayList<Integer> subArrayToReturn = new ArrayList<Integer>();
		
		if(allSubArray.size()>0) {
			
			int hashMapLength = allSubArray.size();
			Set<BigInteger> keySet = allSubArray.keySet();
			sum = BigInteger.ZERO;
			int biggestSubArrayLength = 0;
			
			for(BigInteger b : keySet) {
				
				if(sum.compareTo(b)==-1 && biggestSubArrayLength <= allSubArray.get(b).size()) {
					sum = b;
					biggestSubArrayLength = allSubArray.get(b).size();
				}
			}
			
			subArrayToReturn = allSubArray.get(sum);
		}
		return subArrayToReturn;
	}
	
	
	

}
