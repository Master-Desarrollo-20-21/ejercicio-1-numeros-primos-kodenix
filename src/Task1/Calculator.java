package Task1;

public class Calculator {
	
	private int count = 1;
	private int currentValue;
	private int limite;
	
	public Calculator(int initialValue, int limite) {
		this.currentValue = initialValue;
		this.limite = limite;
	}
	
	public int getIncrementedPrimeNumbers() {
		int increment = 0;
		Number firstnumber = new Number(this.currentValue);
		if (firstnumber.isPrime()) {
			increment += firstnumber.getvalue();
			// System.out.println(firstnumber.getvalue());
		}
		
		
		this.count++;
		this.currentValue++;
		
		do {
			Number nextNumber = new Number(this.currentValue);
			if (nextNumber.isPrime()) {
				increment += nextNumber.getvalue();
				// System.out.println(nextNumber.getvalue());
			}
			
			
			this.count++;
			this.currentValue++;
		} while (count <= this.limite);
		
		return increment;
	}
	
}
