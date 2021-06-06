package com.practice.stacks.queues;

import java.util.Stack;

public class SimplifyDirectoryPath {

	public static void main(String[] args) {

		SimplifyDirectoryPath main = new SimplifyDirectoryPath();
		System.out.println(main.simplifyPath("/a/./b/../../c/"));
	}

	public String simplifyPath(String A) {
		
		String[] segments = A.split("/");
		Stack<String> nameStack = new Stack<>();
		
		
		for(int i = 0 ; i < segments.length; i++) {
			String curr = segments[i];
			if((curr.isEmpty())|| (curr.equals(".")))continue;
			
			if(curr.equals("..")) {
				if(!nameStack.isEmpty()) {
					nameStack.pop();
				}
				continue;
			}
			nameStack.push(curr);
		}
		
		
		StringBuilder path = new StringBuilder();
		for(String name : nameStack) {
			path.append("/");
			path.append(name);
		}
        if (path.length() == 0) path.append("/");
		
		return path.toString();
	}

}
