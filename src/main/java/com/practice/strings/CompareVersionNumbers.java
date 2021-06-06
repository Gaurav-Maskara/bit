package com.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareVersionNumbers {

	public static void main(String[] args) {

		CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
		System.out.println(compareVersionNumbers.compareVersion("8492346606.2", "6137688.2106"));
		
		
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3)) ;
		System.out.println(arr);

		
		
		// System.out.println("1.1".split("."));
	}

	public int compareVersion(String A, String B) {

		String[] version1Array = A.replace(".", " ").split(" ");
		String[] version2Array = B.replace(".", " ").split(" ");

		int counter1 = 0;
		int counter2 = 0;

		while ((counter1 < version1Array.length - 1) && (counter2 < version2Array.length - 1)) {

			if (!version1Array[counter1].equalsIgnoreCase(".")) {
				if (!version2Array[counter2].equalsIgnoreCase(".")) {

					long no1 = Long.parseLong(version1Array[counter1].trim());
					long no2 = Long.parseLong(version2Array[counter2].trim());

					if (no1 > no2) {
						return 1;
					} else if (no1 < no2) {
						return -1;
					}
					counter1++;
					counter2++;

				} else {
					counter2++;
				}
			} else {
				counter1++;
			}
		}

		if (version1Array.length > version2Array.length) {
			return 1;
		} else if (version1Array.length < version2Array.length) {
			return -1;
		} else {
			return 0;
		}

	}
	
	
	public int compareVersion2(String v1, String v2) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(v1.split("[.]")));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(v2.split("[.]")));

        while(a.size() > b.size()) b.add("0");
        while(a.size() < b.size()) a.add("0");

        // int i=0,j=0;

        for(int i=0,j=0; i<a.size() && j<b.size(); i++,j++){
            double d1 = Double.parseDouble(a.get(i));
            double d2 = Double.parseDouble(b.get(j));

            if(d1>d2) return 1;
            else if(d1<d2) return -1;
        }

        return 0;
    }
	
	
	
	
	
	
	
	
	
	

}
