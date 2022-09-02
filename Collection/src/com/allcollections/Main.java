package com.allcollections;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	ArrayList<String> student = new ArrayList<String>();
	student.add("jay");
	student.add("harishchandra");
	student.add("satyavan");
	student.add("arjun");
	//student.add(null);
	System.out.println(student);
	student.add(0, "farukh");
	student.add(1, "austin");
	System.out.println(student);
	student.remove("harishchandra");
	student.remove("satyavan");
	System.out.println(student);
	student.remove(1);
	System.out.println(student);
}
}
