package com.allcollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
public static void main(String[] args) {
	LinkedList<String> subjects = new LinkedList<String>();
	subjects.add("java");
	subjects.add("Android");
	subjects.add("ANgular JS");
	subjects.add("Mongo DB");
	System.out.println(subjects);
	Iterator<String> itr = subjects.iterator();
	while (itr.hasNext()) {
		String string = (String) itr.next();
		System.out.println(string);
	}
	
}
}
