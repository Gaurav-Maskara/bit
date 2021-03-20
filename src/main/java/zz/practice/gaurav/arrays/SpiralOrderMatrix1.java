package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix1 {

	public static void main(String[] args) {
		
		SpiralOrderMatrix1 spiralOrder = new SpiralOrderMatrix1();

		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.get(0).add(1);
		A.get(0).add(2);
		A.get(0).add(3);
		
		A.get(1).add(4);
		A.get(1).add(5);
		A.get(1).add(6);
		
		A.get(2).add(7);
		A.get(2).add(8);
		A.get(2).add(9);
		
		spiralOrder.spiralOrder(A);
	}

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

		ArrayList<Integer> spiralOrder = new ArrayList<Integer>();

		int rows = A.size();
		int columns = A.get(0).size();
		
		int t = 0;
		int b = rows-1;
		int l = 0;
		int r = columns-1;
		int dir = 0;
		
		while(l<=r && t<=b) {
			
			if(dir ==0) {
				for(int k = l; k<=r; k++) {
					spiralOrder.add(A.get(t).get(k));
				}
				t++;
			}else if(dir == 1) {
				for(int k = t; k<=b ; k++) {
					spiralOrder.add(A.get(k).get(r));
				}
				r--;
			}else if(dir ==2 ) {
				for(int k = r; k>=l ; k--) {
					spiralOrder.add(A.get(b).get(k));
				}
				b--;
			}else if(dir == 3) {
				for(int k = b; k>=t; k--) {
					spiralOrder.add(A.get(k).get(l));
				}
				l++;
			}
			
			dir = (dir+1)%4;
		}
		
		return spiralOrder;
	}

}
