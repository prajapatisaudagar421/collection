package com.hashtable;

import java.util.Hashtable;

public class Main {
public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put(1, "saudagar");
	
	ht.put(3, "ram");
	ht.put(2, "prajapati");
	System.out.println(ht);
	//taking the key and remove the elements 
	ht.remove(1);
	//add emements using for loop;
	for (int i = 4; i < 10; i++) {
		ht.put(i, "ram"+i);
	}
	Hashtable h = new Hashtable();
	//creating the clone of the hash table;
	h = (Hashtable) ht.clone();
	System.out.println(h);
	
	
}
}

