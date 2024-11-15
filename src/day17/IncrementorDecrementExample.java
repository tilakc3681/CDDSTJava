package com.destination.jsf.day17;

public class IncrementorDecrementExample {
	public static void main(String[] args) {
		int a=723;
		int b=--a - a-- + --a + a-- + a++ + a++ + ++a - ++a - a-- + a-- + --a;
		System.out.println(a);
		System.out.println(b);
	}
}
