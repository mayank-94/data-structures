/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
class Sum{
	
	int sum(int n) {
		if(n == 1)
			return 1;
		
		return n + sum(n-1);
	}
}

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		int result = sum.sum(5);
		System.out.println("Sum is "+result);
	}
}
