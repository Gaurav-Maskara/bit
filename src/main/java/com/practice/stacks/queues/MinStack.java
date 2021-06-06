package com.practice.stacks.queues;

public class MinStack {

	
	public static void main(String[] args) {

		MinStack ms = new MinStack();
		ms.push(9);
		ms.push(8);
		ms.push(7);
		ms.push(6);
		
		System.out.println(ms.top());
		ms.pop();
		System.out.println(ms.getMin());
		ms.pop();
		System.out.println(ms.getMin());
	}

	
	public void push(int x) {
		 Node nodeToInsert;
	        if(head == null){
	        	nodeToInsert = new Node(x, x);
	        } else {
	        	nodeToInsert = new Node(x, Math.min(x, head.min));
	        	nodeToInsert.next = head;
	        }
	        head = nodeToInsert;
	}

	
	public void pop() {
		if(head != null) {
			head = head.next;
		}
	}
	

	public int top() {
      if(head == null) {
    	  return -1;
      }
      return head.val;
	}
	

	public int getMin() {
		 if(head == null) {
	    	  return -1;
	      }
	      return head.min;
	}
	
	
	

	class Node {
		int val, min;
		Node next;

		Node(int val, int min) {
			this.val = val;
			this.min = min;
			this.next = null;
		}
	}

	Node head;

}
