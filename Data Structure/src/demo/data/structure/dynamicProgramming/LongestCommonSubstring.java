/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String x = "abcdefk";
		String y = "abgdefl";
		int m = x.length();
		int n = y.length();
		int t[][] = new int[m+1][n+1];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(i == 0 || j == 0)
					t[i][j] = 0;
				
				else if(x.charAt(i-1) == y.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
					max = Math.max(max, t[i][j]);
				}
				
				else t[i][j] = 0;
			}
		}
		
		System.out.println(max);
	}
}
