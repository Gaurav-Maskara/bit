package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeInterval {

	public static void main(String args[]) {

		
		
		
		
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

		int length = intervals.size();
		ArrayList<Interval> listToReturn = new ArrayList<Interval>();
		boolean isNewIntervalInterserted = false;
		Interval workingInterval = new Interval();
		
		for(int i = 0; i<length; i ++) {
			workingInterval = intervals.get(i);
			
			if (newInterval.start >= workingInterval.start && newInterval.start <= workingInterval.end) {
				workingInterval.end = newInterval.end >= workingInterval.end ? newInterval.end : workingInterval.end;
				isNewIntervalInterserted = true;
			}else {
				listToReturn.add(workingInterval);
			}
			
			
			Collections.
			
			
		}
		
		
		
		
	}

}



  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
