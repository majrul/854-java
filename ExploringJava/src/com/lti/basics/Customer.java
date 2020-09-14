package com.lti.basics;

public class Customer {

	//member/instance variables, attributes, properties, state, fields 
	//non-static variables / instance variables
	private int id;
	private String name;
	private String email;
	
	//static variables / class variables
	private static String city;
	
	//------------- constructor(s) ---------------//
	public Customer() { //default constructor
		
	}
	public Customer(int id, String name, String email) { //parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//------------ getters/setters ---------------//
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		Customer.city = city;
	}
}
