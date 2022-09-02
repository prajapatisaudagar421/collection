package com.linkedhashset;

import java.util.LinkedHashSet;

public class Main {
public static void main(String[] args) {
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add(8);
	lhs.add(7);
	System.out.println(lhs.clone());
	lhs.add(6);
	lhs.add(5);
	System.out.println(lhs);
	for (int i = 0; i < 5; i++) {
		lhs.add(i);
	}
	System.out.println(lhs);
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.size());
	}

}
