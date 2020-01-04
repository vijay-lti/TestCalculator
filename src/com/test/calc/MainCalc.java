package com.test.calc;

public class MainCalc {

	public static void main(String[] args) {
		CalcFunctions data = new CalcFunctions();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
		System.out.println("WOot! It pushed!");
	}

}
