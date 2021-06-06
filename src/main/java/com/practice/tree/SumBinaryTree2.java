package com.practice.tree;

public class SumBinaryTree2 {

	public static void main(String[] args) {

		SumBinaryTree2 main = new SumBinaryTree2();
		
	}

	public int t2Sum(TreeNode A, int B) {
		TreeNode pointer = A;
		int sum = 0;
		sum = sum+A.val;
		int counter = 1;
		
		do {
			if ((B - sum) < pointer.val) {
				pointer = pointer.left;
				sum = sum + pointer.val;
				counter++;
			} else {
				pointer = pointer.left;
				sum = sum + pointer.val;
				counter++;
			}

			if (sum == B) {
				return 1;
			} else if(counter == 2) {
				sum = pointer.val;
				counter = 0;
			}

		} while (pointer != null);
		
		return 0;
	}

}





class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
