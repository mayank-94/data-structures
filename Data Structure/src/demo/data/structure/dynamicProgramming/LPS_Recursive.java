/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LPS_Recursive {

	public static void main(String[] args) {
		
		String s = "abedba";
		int len = lps(s, 0, s.length()-1);
		System.out.println("Longest Palindromic Subsequence is "+len);
		
		int length = lps(s);
		System.out.println("Longest Palindromic Subsequence is "+length);
	}

	private static int lps(String s, int start, int end) {
		
		if(start > end)
			return 0;
		
		if(start == end)
			return 1;
		
		if(s.charAt(start) == s.charAt(end))
			return 2 + lps(s, start + 1, end - 1);
		
		else
			return Math.max(lps(s, start, end - 1), lps(s, start + 1, end));
		
	}
	
	private static int lps(String s) {
		int n = s.length();
		int t[][] = new int[n+1][n+1];
		
		for(int i=0; i<n+1; i++)
			t[i][i] = 1;
			
		for(int i=n-1; i>=0; i--) {
			for(int j=i+1; j<n; j++) {
				if(s.charAt(i) == s.charAt(j))
					t[i][j] = 2 + t[i+1][j-1];
				
				else
					t[i][j] = Math.max(t[i][j-1], t[i+1][j]);
			}
		}
		
		return t[0][n-1];
	}
}
