package Task1;

public class Number {
	
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	public int getvalue() {
		return this.value;
	}
	
	public boolean isPrime() {
		int count = 2;
		boolean isPrime = true;
		
		if (this.value < 2) {
			isPrime = false;
		}
		
		while (isPrime && count != this.value){
			if (this.value % count == 0)
			  isPrime = false;
			count++;
		}
		
		return isPrime;
	}

}
