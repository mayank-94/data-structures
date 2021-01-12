/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class PrintLCS {

	public static void main(String[] args) {
		
		String x = "abdcfg";
		String y = "aadef";
		int m = x.length();
		int n = y.length();
		int t[][] = new int[m+1][n+1];
		StringBuilder str = new StringBuilder();
		
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
		
		int i=m, j=n;
		while(i > 0 && j > 0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				str = str.append(x.charAt(i-1));
				i--;
				j--;
			}
			
			else {
				if(t[i][j-1] > t[i-1][j])
					j--;
				else
					i--;
			}
				
		}
		
		System.out.println(str.reverse().toString());
	}
}
