package com.test.calc;

public class CalcFunctions {
	private int data[] = {-1, 0, 4, 42, 84};

	public void display() {
		System.out.println("TODO: Implement data display");
		int sum=0;
		for(int i:data) {
			System.out.println("Next Values: "+data[i]);
			sum +=i;
		}
		System.out.println("Sum is: "+sum);
	}
}
