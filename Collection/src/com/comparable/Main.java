package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
	String name;
	
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
	
	@Override
	public int compareTo(Object o) {
		Student st = (Student)o;
		if(age==st.age)  
			return 0;  
			else if(age>st.age)  
			return 1;  
			else  
			return -1;  
			} 
	
	
	
}
class Agecomparable  implements Comparable {

	@Override
	public int compareTo(Object o) {
		int age = Integer.MIN_VALUE;
		Student st = (Student)o;
		if(age==st.age)  
			return 0;  
			else if(age>st.age)  
			return 1;  
			else  
			return -1;  
			
	}
	
}
public class Main {
public static void main(String[] args) {
	Student student = new Student("tom",01,25);
	Student student1 = new Student("tom",01,20);
	Student student2 = new Student("tom",01,23);
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
	Collections.sort(arrayList);
	Iterator iterator2 = arrayList.iterator();
	while (iterator2.hasNext()) {
		Object object = (Object) iterator2.next();
		System.out.println(object);
	}

	
}
}
