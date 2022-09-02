package com.hashtree;

import java.util.Properties;

public class Main {
public static void main(String[] args) {
	Properties pts = new Properties();
	pts.put(1, 'a');
	pts.put(2, 'b');
	pts.put(3, 'c');
	pts.put(4, "b");
	pts.put(4, 'f');
	System.out.println(pts);
	System.out.println(pts.keys());
	System.out.println(pts.keySet());
	System.out.println(pts.containsKey(3));
	System.out.println(pts.getProperty("b"));
	System.out.println(pts.values());
	System.out.println(pts.size());
}
}
