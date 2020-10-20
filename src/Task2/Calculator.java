package Task2;

public class Calculator {
	
	private int count = 1;
	private int currentValue;
	private int limite;
	
	public Calculator(int initialValue, int limite) {
		this.currentValue = initialValue;
		this.limite = limite;
	}
	
	private Number getNextPrime() {
		boolean isPrime = false;
		int num = this.currentValue+1;
		Number number = null;
		while (!isPrime) {
			number = new Number(num);
			if (number.isPrime()) {
				isPrime = true;
			}
			num++;
		}
		
		return number;
	}
	
	public int getIncrementedPrimeNumbers() {
		int increment = 0;
		Number firstnumber = new Number(this.currentValue);
		if (firstnumber.isPrime()) {
			increment += firstnumber.getvalue();
			this.count++;
		}
		
		do {
			Number nextNumber = this.getNextPrime();
			increment += nextNumber.getvalue();
			this.currentValue = nextNumber.getvalue();
			this.count++;			
		} while (count <= this.limite);
		
		return increment;
	}
	
}
