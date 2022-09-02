package com.allcollections;

import java.util.PriorityQueue;

public class Main4 {
public static void main(String[] args) {
	PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
	priorityQueue.add("orange");
	priorityQueue.add("flg");
	priorityQueue.add("watermelon");
	priorityQueue.add("lemon");
	System.out.println(priorityQueue);
	while(priorityQueue.size() != 0) {
		priorityQueue.remove();
	}
	System.out.println(priorityQueue);
}
}
