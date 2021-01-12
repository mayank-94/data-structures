/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class Minimum_Insert_Delete {

	public static void main(String[] args) {
		
		String x = "heap";
		String y = "pea";
		int m = x.length();
		int n = y.length();
		int t[][] = new int[m+1][n+1];
		
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(i == 0 || j == 0)
					t[i][j] = 0;
				else if(x.charAt(i-1) == y.charAt(j-1))
					t[i][j] = 1 + t[i-1][j-1];
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		
		System.out.println("Minimum Deletions = "+(m-t[m][n]));
		System.out.println("Minimum Insertions = "+(n-t[m][n]));
	}
}
