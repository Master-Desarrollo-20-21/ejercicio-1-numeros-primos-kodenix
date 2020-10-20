package Task2;

public class Init {

	public static void main(String[] args) {
		
		System.out.println("La suma de los 50 primeros números primos");
		System.out.println("=========================================");
		
		int initial_value = 0;
		int end_value_included = 50;
		Calculator calculator = new Calculator(initial_value, end_value_included);
		
		System.out.println("Total suma: " + calculator.getIncrementedPrimeNumbers());
	}

}
