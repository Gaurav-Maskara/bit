package com.practice.tree;

import java.util.ArrayList;
import java.util.List;

public class PathtoGivenNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	
	public ArrayList<Integer> solve(TreeNode A, int B) {
		ArrayList<Integer> listToReturn = new ArrayList<>();
		
		dfs(A, B, listToReturn);
		return listToReturn;
    }
	
	
	
	
	public boolean dfs(TreeNode A, int B, ArrayList<Integer> listToReturn){
		if(A == null) {
			return false;
		}
		
		if(A.val == B) {
			listToReturn.add(0, A.val);
			return true;
		}
		
		if(dfs(A.left, B, listToReturn) || dfs(A.right, B, listToReturn)) {
			listToReturn.add(0, A.val);
			return true;
		}
		return false;
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
