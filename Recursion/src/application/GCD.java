package application;

// How to find the Greatest Common Divisor of two numbers using recursion
public class GCD {

	public static void main(String[] args) {
		
		System.out.println(GCD(8,12));
		System.out.println(GCD(100,25));
		System.out.println(GCD(1,0));
		System.out.println(GCD(-10,5));

	}
	
	public static int GCD(int a, int b) {
		if(a<0|| b<0) return -1;
		if(b == 0) return a;
		return GCD(b, a%b);	
	}

}
