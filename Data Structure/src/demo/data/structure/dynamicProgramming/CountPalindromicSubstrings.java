/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class CountPalindromicSubstrings {
	public static void main(String[] args) {
		
		String a = "abcbca";
		int n = a.length();
		
		boolean t[][] = new boolean[n][n];
		int count = 0;
		for(int i=0; i<n; i++) {
			t[i][i] = true;
			count++;
		}
		
		for(int i=n-2; i>=0; i--) {
			for(int j=i+1; j<n; j++) {
				if(a.charAt(i) == a.charAt(j)) {
					if(t[i+1][j-1] || j - i == 1) {
						t[i][j] = true;
						count++;
					}
				}
				else {
					t[i][j] = false;
				}
			}
		}
		
		System.out.println(count);
	}
}
