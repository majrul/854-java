package com.lti.basics.objectclass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Majrul", 39);
		
		System.out.println(p1.getName() + " " + p1.getAge());
		System.out.println(p1); //what happens in this case? In C++, cout << p1;
		//is is possible to display the name and age instead of the default output
		//yes, by overriding toString() method
		//that means toString method is called behind the scenes by print/println
		
		//== comparison operator, in case of objects it compares references and in case of primitives, value
		Person p2 = new Person("Majrul", 39);
		System.out.println(p1 == p2); //reference comparison
		System.out.println(p1.equals(p2)); //value comparison

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		//why do we need to override hashCode along with equals:
		//The rule is that if two objects are equal, then the hashCode should also be the same\
		//hashCode is used by Hashing algorithms like HashSet and HashMap in Java
			//HashSet/HashMap does not allow duplicate elements
		
		
		
		
	}
}
