package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		
		if(intervals == null || intervals.size()<=1) {
			return intervals;
		}
		
		
		Interval slowInterval = intervals.get(0);
		Interval fastInterval = intervals.get(1);
		
		ArrayList<Interval> listToReturn = new ArrayList<Interval>();
		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		
		slowInterval = intervals.get(0);
		for(int i = 0 ; i < intervals.size()-1; i++) {
			
			fastInterval = intervals.get(i+1);
			if ((fastInterval.start >= slowInterval.start || slowInterval.start <= fastInterval.start)
					&& (fastInterval.end >= slowInterval.end || fastInterval.end <= slowInterval.end)) {
				slowInterval.start = slowInterval.start<=fastInterval.start?slowInterval.start:fastInterval.start;
				slowInterval.end = fastInterval.end >= slowInterval.end ?fastInterval.end:slowInterval.end;
			}else {
				listToReturn.add(slowInterval);
				//listToReturn.add(fastInterval);
				slowInterval = fastInterval;
			}
		}
		
		
		
		if(listToReturn.size() == 0) {
			listToReturn.add(slowInterval);
		}else {
			listToReturn.add(fastInterval);
		}
		
		
		return listToReturn;
    }

	
	
}



class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
