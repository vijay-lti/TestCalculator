package com.test.calc;
/*
 * comments to be added
 */
public class CalcFunctions {
	private int data[] = {0, 4, 42};

	public void display() {
		System.out.println("TODO: Implement data display");
		int sum=0;
		for (int i=0;i<data.length;i++) {
			System.out.println("Next Values: "+data[i]);
			sum +=i;
		}
		System.out.println("Sum is: "+sum);
	}
}
