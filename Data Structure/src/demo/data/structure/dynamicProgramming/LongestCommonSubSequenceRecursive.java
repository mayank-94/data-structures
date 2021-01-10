/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestCommonSubSequenceRecursive {

	public static void main(String[] args) {
		
		String x = "abcdgh";
		String y = "abedfhr";
		int m = x.length();
		int n = y.length();
		int length = lcs(x, y, m, n);
		System.out.println(length);
	}

	private static int lcs(String x, String y, int m, int n) {
		if(m == 0 || n == 0)
			return 0;
		
		if(x.charAt(m - 1) == y.charAt(n - 1))
			return 1 + lcs(x, y, m-1, n-1);
		
		else return Math.max(lcs(x, y, m, n-1), lcs(x, y, m-1, n));
	}
}
