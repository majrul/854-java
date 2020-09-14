package com.lti.basics;

public class Calculator {

	public int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		//1. The Calculator class must be getting loaded in the memory if not loaded yet
		//2. Then new keyword creates an instance of this class in the memory
		//3. Then the constructor get's invoked
		//4. Then a pointer pointing to that object get's initialized with the address of the object
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(10, 20));
		System.out.println(Calculator.sub(10, 20));
	}
}
