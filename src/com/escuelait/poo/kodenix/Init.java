package com.escuelait.poo.kodenix;

public class Init {

	public static void main(String[] args) {
		
		final Number endValue = new Number(50);
		Calculator calculator = new Calculator(endValue);
		
		System.out.println("=================================================");
		System.out.println("                ESCUELA IT                       ");
		System.out.println("=================================================");
		
		System.out.println("1- La suma de los números primos que hay entre los "+endValue.getValue()+" primeros números");
		System.out.println("..................................................");
		Number total1 = calculator.getIncrementedPrimeNumbersOnRange();
		System.out.println();
		System.out.println("..................................................");
		System.out.println("Total: "+ total1.getValue());
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("2- La suma de los "+endValue.getValue()+" primeros números primos");
		System.out.println("..................................................");
		Number total2 = calculator.getIncrementedLimitsPrimeNumbers();
		System.out.println();
		System.out.println("..................................................");
		System.out.println("Total: " + total2.getValue());
	}

}
