package testPractice;

public class Test1_Arrays {

	public static void main(String[] args) {
		// Array
		int[]  numbers= {12, 5, 75, 55, 67};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[4] + "\n");

	
	
	for (int i = numbers.length - 1; i >= 0; i--) {
		
		System.out.println(numbers[i]);
		
	}

	System.out.println("\n");
	int k = 0;
	for (int j = 0; j < numbers.length; j++) {
		k = k + 1;
	}
	System.out.println(" The Number of elements in a Array are : " + k);
	
	}
}
