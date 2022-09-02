package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
	ArrayList<Student> arraylist = new ArrayList<Student>();
	arraylist.add(student);
	arraylist.add(student2);
	arraylist.add(student4);
	//add the object in give index number;
	arraylist.add(1, student3);
	System.out.println(arraylist);
	//remove the object to the arraylist;
	arraylist.remove(3);
	System.out.println(arraylist);
	//search
	System.out.println(arraylist.get(2));
	System.out.println("foreach loop");
	for(Object object : arraylist) {
		System.out.println(object);
	}
	System.out.println("iterator");
	Iterator iterator = arraylist.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	System.out.println("list iterator");
	ListIterator listIterator = arraylist.listIterator();
	while (listIterator.hasNext()) {
		Object object = (Object) listIterator.next();
		System.out.println(object);
	}
	//creating the clone of the araylist
	ArrayList al = new ArrayList();
	al = (ArrayList) arraylist.clone();
	System.out.println(al);
	
}
}
