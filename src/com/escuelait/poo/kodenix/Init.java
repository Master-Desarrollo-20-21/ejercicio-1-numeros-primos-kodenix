package com.escuelait.poo.kodenix;

public class Init {
	
	final static Number END_VALUE = new Number(50);

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(END_VALUE);
		printHeader();
		calculator.printExercise1();
		printSeparator();
		calculator.printExercise2();
		
	}
	
	public static void printHeader() {
		System.out.println("=================================================");
		System.out.println("                ESCUELA IT                       ");
		System.out.println("=================================================");
	}
	
	public static void printSeparator() {
		System.out.println("--------------------------------------------------");
	}

}
