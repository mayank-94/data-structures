/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestPalindromicSubSequence {

	public static void main(String[] args) {
		
		String s1 = "abgcba";
		StringBuilder sb = new StringBuilder(s1);
		sb.reverse();
		String s2 = sb.toString();
		
		int m = s1.length();
		int n = s2.length();
		
		int t[][] = new int[m+1][n+1];
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(i == 0 || j == 0)
					t[i][j] = 0;
				
				else if(s1.charAt(i-1) == s2.charAt(j-1))
					t[i][j] = 1 + t[i-1][j-1];
				
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		
		System.out.println(t[m][n]);
	}
}
