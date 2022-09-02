package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



class Student{
	 private String name;
	
	public String getName() {
		return name;
	}
	
	int id;
	int age;
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
}
class Agecomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s = (Student) o1;
		Student s1 = (Student) o2;
		if (s.age==s1.age) {
			return 0;
		}
		else if (s.age>s1.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class Idcomparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student s = (Student) o1;
		Student s1 = (Student) o2;
		if (s.id==s1.id) {
			return 0;
		}
		else if (s.id>s1.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
class Namecomparaotr implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s = (Student) o1;
		Student s1 = (Student) o2;
		return s.getName().compareTo(s1.getName());
	}
	
}
public class Main {
public static void main(String[] args) {
	Student student = new Student("herry",01,25);
	Student student1 = new Student("jerry",03,20);
	Student student2 = new Student("tom",02,23);
	ArrayList arrayList = new ArrayList();
	arrayList.add(student);
	arrayList.add(student1);
	arrayList.add(student2);
	Iterator iterator = arrayList.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	System.out.println("sorted by age");
	Collections.sort(arrayList,new Agecomparator());
	Iterator iterator2 = arrayList.iterator();
	while (iterator2.hasNext()) {
		Object object = (Object) iterator2.next();
		System.out.println(object);
	}
	System.out.println("sorted by id");
	Collections.sort(arrayList,new Idcomparator());
	Iterator iterator3 = arrayList.iterator();
	while (iterator3.hasNext()) {
		Object object = (Object) iterator3.next();
		System.out.println(object);
	}
	System.out.println("sorted by name");
	Iterator  iterator4 = arrayList.iterator();
	while (iterator4.hasNext()) {
		Object object = (Object) iterator4.next();
		System.out.println(object);
	}
}
}
