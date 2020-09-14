package com.lti.basics.innerclassandlambda;

class Outer {
	private int x = 10;
	
	class Inner {
		void check() {
			System.out.println(x);
		}
	}
	
	static class Inner2 {
		void check() {
			System.out.println("Hello");
		}
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.check();
		Outer.Inner2 i2 = new Outer.Inner2();
		i2.check();
	}
}
