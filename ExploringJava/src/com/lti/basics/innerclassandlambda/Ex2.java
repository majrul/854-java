package com.lti.basics.innerclassandlambda;

interface Printer {
	void print(String document);
}

class DotMatrixPrinter implements Printer {
	@Override
	public void print(String document) {
		System.out.println("printing " + document);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Printer dp = new DotMatrixPrinter();
		dp.print("abc.txt");
		
		//inner classes can be written anywhere inside the class, including a function too
		class DeskjetPrinter implements Printer {
			@Override
			public void print(String document) {
				System.out.println("printing " + document);
			}
		}
		Printer djp = new DeskjetPrinter();
		djp.print("def.txt");
		
		//anonymous inner class coming up next:
		//basically a class is getting created here which is implementing Printer interface
		//anonymous inner classes are subclasses extending/implementing some class/interface
		Printer sp = new Printer() {
			@Override
			public void print(String document) {
				System.out.println("printing " + document);
			}
		};
		sp.print("ghi.txt");
		
		//lambda expression coming up next:
		//anonymous functions
		//Printer pr = document -> {
		Printer pr = (String document) -> {
			System.out.println("printing " + document);
		};
		pr.print("jkl.txt");
		
		Printer pp = d -> System.out.println("printing " + d);
		pp.print("mno.txt");
		
		//try one anonmyous inner class version and one lambda version of Math interface
		Math m1 = new Math() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(m1.calc(10, 20));
		
		Math m2 = (x,y) -> x - y;
		System.out.println(m2.calc(10, 20));
	}
	
}

@FunctionalInterface //optional
interface Math {
	int calc(int x, int y);
	//int xyz(int x, int y); -- compilation error if we mark the interface as @FunctionalInterface
}