package com.destination.jsf.day15;
class Calculator{
	static int a,b,c;//static variables
	int m,n,o;//non-statice variables
	//static block
	static {
		System.out.println("hi");
		a=100;
		b=200;
		c=300;
	}
	//non-static block
	{
		m=10;
		n=20;
		o=30;
	}
	//static methods
	static void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	//non-static methods
	void display2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
}

public class staticExample {
	public static void main(String[] args) {
		System.out.println("main");
		Calculator.display1();
		Calculator c = new Calculator(); //Object
		c.display2();
	}

}
