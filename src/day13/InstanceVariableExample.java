package com.destination.jfs.day13;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
		
	}
	void allocateData() {
		name="tommy";
		color="brown";
		breed="pug";
		cost=4000;
		age=2;
	}
}

public class InstanceVariableExample {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
		System.out.println("++++++++++");
		d1.allocateData();
		d1.display();
		
	}
}
