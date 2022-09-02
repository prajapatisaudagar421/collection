package com.arraydeque;

import java.util.ArrayDeque;

public class Main {
public static void main(String[] args) {
	ArrayDeque ad = new ArrayDeque();
	ad.add(1);//add the element in last index
	ad.add(2);
	ad.add(3);
	ad.addFirst(0);
	ad.addLast(4);
	System.out.println(ad);
	System.out.println(ad.contains(3));
	System.out.println(ad.getFirst());
	System.out.println(ad.getLast());
	System.out.println(ad.isEmpty());
	System.out.println(ad.element());
	System.out.println(ad.size());
	ad.push(5);//push the element in first index
	System.out.println(ad);
	
}
}
