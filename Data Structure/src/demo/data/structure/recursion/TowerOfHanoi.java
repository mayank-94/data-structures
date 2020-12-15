/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
public class TowerOfHanoi {
	public static void main(String[] args) {
		
		int n = 3;
		int source = 1, helper = 2, destination = 3;
		solve(source, destination, helper, n);
	}

	private static void solve(int source, int destination, int helper, int n) {
		
		if(n == 1) {
			System.out.println("Moving plate "+n+" from "+source+" to "+destination);
			return;
		}
		solve(source, helper, destination, n-1);
		System.out.println("Moving plate "+n+" from "+source+" to "+destination);
		solve(helper, destination, source, n-1);
	}
}
