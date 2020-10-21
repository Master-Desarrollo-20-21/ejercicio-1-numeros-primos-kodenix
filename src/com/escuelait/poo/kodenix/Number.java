package com.escuelait.poo.kodenix;

public class Number {
	
	private int value;
	
	public Number() {
		value = 0;
	}
	
	public Number(Number number) {
		value = number.getValue();
	}
	
	public Number(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isPrime() {
		int divisor = 2;
		boolean isPrime = true;
		
		if (value < divisor) return false;
		
		while (isPrime && divisor < value){
			if (value % divisor == 0)
			  isPrime = false;
			divisor++;
		}
		
		return isPrime;
	}

	public boolean isEqualTo(Number number) {
		return value == number.getValue();
	}
	
	public boolean isGreaterThan(Number number) {
		return value > number.getValue();
	}
	
	public boolean isGreaterThanOrEqualTo(Number number) {
		return isGreaterThan(number) || isEqualTo(number);
	}
	
	public boolean isLessThan(Number number) {
		return value < number.getValue();
	}
	
	public boolean isLessThanOrEqualTo(Number number) {
		return isLessThan(number) || isEqualTo(number);
	}
	
	public Number nextPrimeNumber() {
		boolean isPrime = false;
		Number number = incrementedOne();
		
		while (!isPrime) {
			
			if (number.isPrime()) {
				isPrime = true;
			} else {
				number.incrementOne();
			}
		}
		
		return number;
	}
	
	public void increment(Number number) {
		value += number.getValue();
	}
	
	public void increment(int plusValue) {
		value += plusValue;
	}
	
	public void incrementOne() {
		increment(1);
	}

	public Number incrementedOne() {
		return new Number(value+1);
	}
	
	public void print() {
		System.out.print(this.value);
		System.out.print(",");
	}
}
