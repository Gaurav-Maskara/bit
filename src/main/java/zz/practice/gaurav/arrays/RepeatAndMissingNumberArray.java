package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class RepeatAndMissingNumberArray {

	public static void main(String[] args) {

		RepeatAndMissingNumberArray ram = new RepeatAndMissingNumberArray();
		
		
		
		
	}
	
	
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		
      TreeSet<Long> treeSet = new TreeSet<Long>();
      long repeatedInteger = 0;
      long counter = 1;
     
      for(long i :A) {
    	  if(!treeSet.add(i)) {
    		  repeatedInteger =  i;
    	  }
      }
      
      long missingNumber = 0;
      Iterator<Long> itr = treeSet.iterator();
      
        while(itr.hasNext()) {
        	if(itr.next()!=counter) {
        		missingNumber = counter;
        		break;
        	}
        	counter++;
        }
      
        ArrayList<Integer> arrayListToReturn = new ArrayList<Integer>();
        arrayListToReturn.add((int) repeatedInteger);
        arrayListToReturn.add((int) missingNumber);
        return arrayListToReturn;
    }

}
