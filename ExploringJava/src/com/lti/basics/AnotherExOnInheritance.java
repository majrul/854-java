package com.lti.basics;

class Employee /*extends Object*/ {
	int empno;
	String name;
	double salary;
	
	Employee() {
	}
	Employee(int empno, String name, double salary) {
		//super(); //optional - by default it will search for default constr in parent class
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	double monthlySalary() {
		return salary;
	}
	
	void info() {
		System.out.println("Empno = " + empno);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
	}
}

class Manager extends Employee {
	double commission;

	Manager(int empno, String name, double salary, double commission) {
		super(empno, name, salary);
		/*this.empno = empno;
		this.name = name;
		this.salary = salary;*/
		this.commission = commission;
	}
	
	double monthlySalary() {
		return salary + commission;
	}
	
	void info() {
		super.info();
		System.out.println("Commission = " + commission);
	}
}

class Developer extends Employee {
	double overtime;

	Developer(int empno, String name, double salary, double overtime) {
		super(empno, name, salary);
		this.overtime = overtime;
	}
	
	double monthlySalary() {
		return salary + overtime * 100;
	}
}

public class AnotherExOnInheritance {

	public static void main(String[] args) {
		Employee mgr = new Manager(1001, "Nikhil", 2000, 1000);
		Employee dvr = new Developer(1002, "Majrul", 1000, 24);
		
		//mgr.info();
		System.out.println(mgr.monthlySalary());
		System.out.println(dvr.monthlySalary());
	}
}
