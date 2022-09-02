package com.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack stack = new Stack();
	stack.push(0);
	stack.push(1);
	stack.push(2);
	try {
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	} catch (EmptyStackException e) {
		System.out.println("EmptyStackException");
	}
	
	
}
}
