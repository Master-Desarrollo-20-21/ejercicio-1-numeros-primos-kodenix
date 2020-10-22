package com.escuelait.poo.kodenix;

public class Init {
	
	final static Number END_VALUE = new Number(50);

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(END_VALUE);
		calculator.printExercise1();
		printSeparator();
		calculator.printExercise2();
		
	}
	
	public static void printSeparator() {
		System.out.println("--------------------------------------------------");
	}

}
