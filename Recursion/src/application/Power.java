package application;

// How to calculate power of a number using recursion
public class Power {

	public static void main(String[] args) {
		
		System.out.println(power(2,10));
		System.out.println(power(5,3));
		System.out.println(power(2,-1));
		System.out.println(power(-5,0));
		System.out.println(power(2,0));

	}
	
	public static int power(int base, int exp) {
		if(exp < 0)  return -1;			  // Step 3
		if(exp == 0) return 1;			  // Step 2	
		return base * power(base, exp-1); // Step 1
	}

}
