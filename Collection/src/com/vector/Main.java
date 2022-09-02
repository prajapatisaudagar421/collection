package com.vector;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	String name;
	int id;
	String add;
	public Student(String name, int id, String add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
	
	
}
public class Main {
public static void main(String[] args) {
	Student student = new Student("saudagar",1,"mumbai");
	Student student2 = new Student("ram",2,"mumbai");
	Student student3 = new Student("shyam",3,"vasai road");
	Student student4 = new Student("shyam",3,"vasai road");
	Vector vector = new Vector();
	vector.add(student);
	vector.add(student2);
	vector.add(student4);
	//add the object in give index number;
	vector.add(1, student3);
	System.out.println(vector);
	//remove the object to the arraylist;
	vector.remove(3);
	System.out.println(vector);
	//serach
	System.out.println(vector.get(0));

	System.out.println("foreach loop");
	for(Object object : vector) {
		System.out.println(object);
	}
	System.out.println("iterator");
	Iterator iterator = vector.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	System.out.println("list iterator");
	ListIterator listIterator = vector.listIterator();
	while (listIterator.hasNext()) {
		Object object = (Object) listIterator.next();
		System.out.println(object);
	}
	System.out.println("enumeration");
	Enumeration enumeration = vector.elements();
	while (enumeration.hasMoreElements()) {
		Object object = (Object) enumeration.nextElement();
		System.out.println(object);
	}
	
}
}

