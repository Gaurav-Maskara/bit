package com.practice.arrays;

import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {

	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

		ArrayList<Interval> listToReturn = new ArrayList<Interval>();

		boolean isUsed = false;
		int x = newInterval.start;
		int y = newInterval.end;

		Interval intervalToHold = new Interval();
		intervalToHold.start = -1;
		intervalToHold.end = -1;

		for (int i = 0; i < intervals.size(); i++) {
			Interval looper = intervals.get(i);
			int a = looper.start;
			int b = looper.end;

			if (x > a && x > b) {
				Interval intvl = new Interval();
				intvl.start = a;
				intvl.end = b;
				listToReturn.add(intvl);

				if (intervalToHold.start != -1) {
					listToReturn.add(intervalToHold);
					intervalToHold.start = -1;
					intervalToHold.end = -1;
					isUsed = true;
				}

			} else if (x == a && y == b) {
				Interval intvl = new Interval();
				intvl.start = a;
				intvl.end = b;
				listToReturn.add(intvl);
				isUsed = true;
			} else if (x >= a && y > b && x < b) {
				intervalToHold.start = a;
				intervalToHold.end = y;
				x = intervalToHold.start;
				y = intervalToHold.end;
			} else if (x <= a && y < b && y >= a) {
				intervalToHold.start = x;
				intervalToHold.end = b;
				x = intervalToHold.start;
				y = intervalToHold.end;
			}

		}
		
		if(!isUsed) {
			listToReturn.add(newInterval);
		}
		
		
		return listToReturn;
	}

}




//class Interval {
//	int start;
//	int end;
//
//	Interval() {
//		start = 0;
//		end = 0;
//	}
//
//	Interval(int s, int e) {
//		start = s;
//		end = e;
//	}
//}
