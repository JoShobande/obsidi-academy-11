package com.bptn.course.ConnectFour;

import java.util.Scanner;

public class Player {
	
	private String name;
	private String number;
	
	private static Scanner userInput = new Scanner(System.in);

	public Player(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName(){
		return name;
	}

	public String getPlayerNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int makeMove() {
		System.out.println("Make your move. What column do you want to put a token in?");
		int column = userInput.nextInt();
		return column;
	}
	
	@Override
	public String toString() {
	    return name;
	}

}
