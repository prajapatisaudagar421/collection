package com.allcollections;

import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList();
	for (int i = 0; i < 5; i++) {
		q.add(i);
	}
	System.out.println(q);
	int removeble = q.remove();
	System.out.println(removeble);
	System.out.println(q);
	int head = q.peek();
	System.out.println(head);
	int size = q.size();
	System.out.println(size);
}
}
