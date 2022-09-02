package com.hashmap;

import java.util.HashMap;

public class Main {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(6, 'a');
	hm.put(5, 'b');
	hm.put(4, 'c');
	hm.put(3, 'a');
	hm.put(3, 'd');
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.entrySet());
	System.out.println(hm.replace(6, 'a', 'e'));
	System.out.println(hm);
	System.out.println(hm.values());
	
}
}
