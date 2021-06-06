package com.practice.heaps.and.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>(3);

	}

	Map<Integer, Node> hm;
	Node start;
	Node end;
	int capacity;

	public LRUCache(int capacity) 
	    {
	        hm = new HashMap<>();
	        start = new Node(0,0);
	        end = new Node(0,0);
	        this.capacity = capacity;
	        start.next = end;
	        end.prev = start; 
	    }

	private void addNode(Node node) {
		node.next = start.next;
		start.next = node;
		node.prev = start;
		node.next.prev = node;
	}

	private void removeNode(Node node) {
		Node temp = node.next;
		node.prev.next = temp;
		temp.prev = node.prev;
	}

	public int get(int key) {
		if (hm.containsKey(key)) {
			Node node = hm.get(key);
			removeNode(node);
			addNode(node);
			return node.val;
		}

		return -1;

	}

	public void set(int key, int value) {
		Node node = new Node(key, value);
		if (hm.containsKey(key)) {
			Node n = hm.get(key);
			removeNode(n);
			addNode(node);
		} else {
			if (hm.size() == capacity) {
				Node temp = end.prev;
				removeNode(temp);
				hm.remove(temp.key);
			}

			addNode(node);
		}

		hm.put(key, node);

	}

	class Node {
		public int key;
		public int val;
		public Node prev;
		public Node next;

		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			prev = null;
			next = null;
		}
	}

}
