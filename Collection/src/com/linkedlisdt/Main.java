package com.linkedlisdt;

import java.util.LinkedList;




public class Main {
public static void main(String[] args) {
	
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.add("a");
	linkedList.add("b");
	linkedList.add("c");
	linkedList.add("d");
	linkedList.add("e");
	System.out.println(linkedList);
	//remove object by name
	linkedList.remove("c");
	//remove onject by indexing number
	linkedList.remove(2);
	System.out.println(linkedList);
	//add the object in the first position
	linkedList.addFirst("z");
	//add the object in the last position
	linkedList.addLast("y");
	//add the object by given position
	linkedList.add(3, "x");
	System.out.println(linkedList);
	//remove first object
	linkedList.removeFirst();
	//remove last object
	linkedList.removeLast();
	//search
	System.out.println(linkedList.get(0));
	//System.out.println(linkedList);
	
}
}
