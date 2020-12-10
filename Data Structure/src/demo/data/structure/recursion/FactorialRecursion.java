/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
class Factorial{
	
	int factorial(int n) {
		if(n == 1)
			return 1;
		
		return n * factorial(n-1);
	}
	
}

public class FactorialRecursion {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		int res = fact.factorial(5);
		System.out.println(res);
		
	}
}
