package com.escuelait.poo.kodenix;

public class Calculator {
	
	private Number initNumber = new Number(0);
	private Number lastNumber;
	
	public Calculator(Number lastNumber) {
		this.lastNumber = lastNumber;
	}
	
	public Calculator(int lastValue) {
		this.lastNumber = new Number(lastValue);
	}
	
	private Number getIncrementedPrimeNumbersOnRange() {
		Number currentNumber = new Number(initNumber);
		Number totalAmount = new Number();
		
		while (currentNumber.isLessThanOrEqualTo(lastNumber)) {
			
			if (currentNumber.isPrime()) {
				totalAmount.increment(currentNumber);
			}
			currentNumber.incrementOne();
		}
		
		return totalAmount;
	}
	
	private Number getIncrementedLimitsPrimeNumbers() {
		Number countedNumbers = new Number(1);
		Number totalAmount = new Number();
		Number currentNumber = new Number();
				
		if (!currentNumber.isPrime()) currentNumber = currentNumber.nextPrimeNumber();
		
		while (countedNumbers.isLessThanOrEqualTo(lastNumber)) {
			totalAmount.increment(currentNumber);
			countedNumbers.incrementOne();
			currentNumber = currentNumber.nextPrimeNumber();
		}
		
		return totalAmount;
	}
	
	public void printExercise1() {
		System.out.println("(Exercise 1) - La suma de los números primos que hay entre los "+lastNumber.getValue()+" primeros números");
		Number total1 = getIncrementedPrimeNumbersOnRange();
		System.out.println("Total: "+ total1.getValue());
	}
	
	public void printExercise2() {
		System.out.println("(Exercise 2) - La suma de los "+lastNumber.getValue()+" primeros números primos");
		Number total2 = getIncrementedLimitsPrimeNumbers();
		System.out.println("Total: " + total2.getValue());
	}
	
	
}
