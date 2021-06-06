package com.practice.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PrimeSum {

	public static void main(String[] args) {

		PrimeSum mas = new PrimeSum();

		
		System.out.println(mas.primesum(10));
	}

	public ArrayList<Integer> primesum(int A) {
      HashSet<Integer> hashSet = new HashSet<>();
      
      ArrayList<Integer> listToReturn = new ArrayList<>();
      
      
      for(int i = 2; i < A ; i++) {
    	 // int sqrt = (int) Math.sqrt(i);
    	  int count = 0;
    	  for(int j = 2 ; j<=i; j++ ) {
    		  if(i%j == 0) {
    			 count++;
    		  }
    	  }
    	  if(count == 1) {
    		  hashSet.add(i);
    	  }
      }
      
	   Iterator<Integer> itr = hashSet.iterator();
       while(itr.hasNext()) {
    	   int prime1 = itr.next();
    	   
    	   if(hashSet.contains(A-prime1)) {
    		   listToReturn.add(prime1);
    		   listToReturn.add(A-prime1);
    		   return listToReturn;
    	   }
    	   
       }
		return listToReturn;
	}

}
