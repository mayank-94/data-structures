/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		
		String a = "aabcbedd";
		String b = a;
		int m = a.length();
		int n = b.length();
		int t[][] = new int[m+1][n+1];
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				
				if(i == 0 || j == 0)
					t[i][j] = 0;
				
				else if(a.charAt(i-1) == b.charAt(j-1) && i!=j)
					t[i][j] = 1 + t[i-1][j-1];
				
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		
		System.out.println(t[m][n]);
	}
}
