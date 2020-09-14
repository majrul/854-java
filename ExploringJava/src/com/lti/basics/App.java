package com.lti.basics;

public class App {

	public static void main(String[] args) {
		//creating objects of Customer class
		Customer c1 = new Customer(1, "Nikhil", "nikhil@lti");
		c1.setCity("Delhi");
		
		Customer c2 = new Customer();
		c2.setId(2);
		c2.setName("Majrul");
		c2.setEmail("majrul@lti");
		c2.setCity("Mumbai");
		
		//type sysout then press ctrl+space
		System.out.printf("\nID = %d, Name = %s, Email = %s", c1.getId(), c1.getName(), c1.getEmail());
		System.out.printf("\nID = %d, Name = %s, Email = %s", c2.getId(), c2.getName(), c2.getEmail());
		
		System.out.println();
		System.out.println(c1.getCity());
		System.out.println(c2.getCity());
		
		Customer c3 = new Customer();
		System.out.println(c3.getCity());
	}
}
