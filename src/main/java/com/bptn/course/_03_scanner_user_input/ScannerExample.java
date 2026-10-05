package com.bptn.course._03_scanner_user_input;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int choice;
		String name;
		
		System.out.print("Enter your choice : ");
//		choice = scanner.nextInt();
		name = scanner.nextLine();
		
		System.out.print("\nYou entered : "+name);
		
		scanner.close();
	}
}
