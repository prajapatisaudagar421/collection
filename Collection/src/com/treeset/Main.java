package com.treeset;

import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	TreeSet	ts = new TreeSet();
	ts.add(7);
	ts.add(8);
	ts.add(9);
	System.out.println(ts);
	for (int i = 0; i < 5; i++) {
		ts.add(i);
	}
	System.out.println(ts);
	System.out.println(ts.last());
	System.out.println(ts.floor(6));
	System.out.println(ts.ceiling(6));
	System.out.println(ts.first());
	System.out.println(ts.pollFirst());
	System.out.println(ts);
	ts.remove(9);
	System.out.println(ts);
	
}
}
