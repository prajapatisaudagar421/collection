package com.priorityqueque;

import java.util.PriorityQueue;

public class Main {
public static void main(String[] args) {
	PriorityQueue priorityQueue = new PriorityQueue();
	priorityQueue.add("a");
	priorityQueue.add("b");
	priorityQueue.add("c");
	priorityQueue.add("d");
	priorityQueue.add("e");
	//priorityQueue.add("a");
	//check wheater the elements are in the queue .
	System.out.println(priorityQueue.contains("a"));
	System.out.println(priorityQueue.element());
	System.out.println(priorityQueue);
	System.out.println(priorityQueue.peek());
	System.out.println(priorityQueue);
	priorityQueue.remove();
	System.out.println(priorityQueue);
	
	System.out.println(priorityQueue.poll());
	System.out.println(priorityQueue);
	System.out.println(priorityQueue.size());
	
}
}
