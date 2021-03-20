package zz.practice.gaurav.arrays;

import java.util.ArrayList;

public class PerfectPeakOfArray {

	public static void main(String[] args) {

		PerfectPeakOfArray pp = new PerfectPeakOfArray();
		int[] array = {10549, 15882, 24856, 301, 16642, 14414, 19856};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i :array) {
			arrayList.add(i);
		}
		
		System.out.println(pp.perfectPeak(arrayList));
	}

	public int perfectPeak(ArrayList<Integer> A) {
		
		int peakExists = 0;
		boolean isPeakPerfect = true;
		
		for(int i = 1; i<A.size()-1; i++) {
			isPeakPerfect = true;
			
			for(int j = 0 ; j<A.size(); j++) {
				if(j<i) {
					if(!(A.get(i)>A.get(j))) {
						isPeakPerfect = false;
						break;
					}
				}else if(i==j) {
					continue;
				}else {
					if(!(A.get(i)<A.get(j))) {
						isPeakPerfect = false;
						break;
					}
				}
			}
			
			if(isPeakPerfect) {
				return 1;
			}
		}
		return peakExists;
	}

}
