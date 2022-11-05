package application;

// How to find the sum of digits of a positive integer number using recursion?
public class Sum {

	public static void main(String[] args) {
		
		System.out.println(recursiveSum(0));
		System.out.println(recursiveSum(5));
		System.out.println(recursiveSum(52));
		System.out.println(recursiveSum(533));
		System.out.println(recursiveSum(111));
		System.out.println(recursiveSum(-5));	
		
	}
	
	public static int recursiveSum(int a) {
		if (a < 0)  return 0; // Step 3 - Unintentional case 
		if (a == 0) return 0; // Step 2 - the stop condition
		return a%10 + recursiveSum(a/10); // Step 1 - the flow
	}
}
