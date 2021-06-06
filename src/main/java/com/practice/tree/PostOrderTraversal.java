package com.practice.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		PostOrderTraversal main = new PostOrderTraversal();
		
		
		
		
	}

	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		
		ArrayList<Integer> listToReturn = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pointer = A;
		
		while((pointer != null) || (stack.size() > 0)) {
			
            while(pointer != null) {
            	stack.push(pointer);
            	pointer = pointer.left;
            }
            
            pointer = stack.pop();
            
            while(pointer != null) {
            	stack.push(pointer);
            	pointer = pointer.right;
            }
            
			listToReturn.add(pointer.val);
			
            
		}
		
		
		
	}

}
