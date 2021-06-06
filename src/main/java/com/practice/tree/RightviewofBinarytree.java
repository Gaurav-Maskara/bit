package com.practice.tree;

import java.util.ArrayList;
import java.util.Stack;

public class RightviewofBinarytree {

	public static void main(String[] args) {
		RightviewofBinarytree main = new RightviewofBinarytree();
		
		
		
		
		
	}

	public ArrayList<Integer> solve(TreeNode A) {
		
		
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> listToReturn = new ArrayList<>();
		
		stack.add(A);
		int stackSize = stack.capacity();
		
		while(!stack.isEmpty()) {
			
			TreeNode pointer = stack.pop();
			stackSize--;
			
			select s.studentname 
			from student s
			inner join attendance a on s.studentId = a.studid
			inner join lecture l on l.lecId = a.lectureid 
			group by s.studentId, s.studentname 
			having 
			    sum(l.professor= 'JOHN') = (select count(*) from lecture where professor = 'JOHN')
			    and max(l.professor = 'JOSEPH') = 0


			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	

}
