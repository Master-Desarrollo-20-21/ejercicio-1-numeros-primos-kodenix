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
	
	public Number getIncrementedPrimeNumbersOnRange() {
		Number currentNumber = new Number(initNumber);
		Number totalAmount = new Number();
		
		while (currentNumber.isLessThanOrEqualTo(lastNumber)) {
			
			if (currentNumber.isPrime()) {
				totalAmount.increment(currentNumber);
				currentNumber.print();
			}
			currentNumber.incrementOne();
		}
		
		return totalAmount;
	}
	
	public Number getIncrementedLimitsPrimeNumbers() {
		Number countedNumbers = new Number(1);
		Number totalAmount = new Number();
		Number currentNumber = new Number();
				
		if (!currentNumber.isPrime()) currentNumber = currentNumber.nextPrimeNumber();
		
		while (countedNumbers.isLessThanOrEqualTo(lastNumber)) {
			currentNumber.print();
			totalAmount.increment(currentNumber);
			countedNumbers.incrementOne();
			currentNumber = currentNumber.nextPrimeNumber();
		}
		
		return totalAmount;
	}
	
}
