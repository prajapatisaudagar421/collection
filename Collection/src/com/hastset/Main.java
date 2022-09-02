package com.hastset;

import java.util.HashSet;

public class Main {
public static void main(String[] args) {
	HashSet st = new HashSet();
	st.add(1);
	st.add(2);
	for (int i = 0; i <= 5; i++) {
		st.add(i);//its contain only unique elements
	}
	System.out.println(st);
	System.out.println(st.size());
	System.out.println(st.remove(4));
	System.out.println(st);
	System.out.println(st.getClass());
	}
}
