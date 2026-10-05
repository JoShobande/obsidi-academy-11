package com.bptn.course._02_variables_operators;

public class Operators {
	public static void main(String[] args) {
	/* Post-Increment */
	int a = 5; 
	int b = a++;
	

	System.out.printf("a=%d, b=%d\n", a, b); // Prints out: a=6, b=5

	/* Pre-Increment */
	a = 5; 
	b = ++a; 

	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=6
//
//	/* Post-Decrement */
//	int a = 5; 
//	int b = a--; 
//
//	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=5
//
//	/* Pre-Decrement */
//	a = 5; 
//	b = --a; 
//
//	System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=4
	}
}
