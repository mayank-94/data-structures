/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestCommonSubSequenceMemoized {
	
	public static void main(String[] args) {
		
		String x = "abcdgh";
		String y = "abedfhr";
		int m = x.length();
		int n = y.length();
		int t[][] = new int[m+1][n+1];
		int length = lcs(x, y, m, n, t);
		System.out.println(length);
	}

	private static int lcs(String x, String y, int m, int n, int t[][]) {
		if(m == 0 || n == 0)
			return 0;
		
		if(t[m][n] != 0)
			return t[m][n];
		
		if(x.charAt(m - 1) == y.charAt(n - 1))
			return t[m][n] = 1 + lcs(x, y, m-1, n-1, t);
		
		else return t[m][n] = Math.max(lcs(x, y, m, n-1, t), lcs(x, y, m-1, n, t));
	}
}
