package com.destination.jsf.day17;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		int n2 = sc.nextInt();
		
		System.out.println("Select the option:\n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n");
		int choice=  sc.nextInt();
		int res;
		switch(choice) {
		case 1:{
			System.out.println("Addition");
			res = n1+n2;
			System.out.println(res);
			break;
		}
		case 2:{
			System.out.println("Subtraction");
			res = n1-n2;
			System.out.println(res);
			break;
		}
		case 3:{
			System.out.println("Multiplication");
			res = n1*n2;
			System.out.println(res);
			break;
		}
		case 4:{
			System.out.println("Division");
			res = n1/n2;
			System.out.println(res);
			break;
		}
		
		default: {
			System.out.println("you entered wrong option");
		}
		}
		
	}
}


