/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class RodCuttingProblem {

	public static void main(String[] args) {
		
		int N = 4;
		int prices[] = {1, 2, 8, 8};
		int length[] = new int[N];
		for(int i=0; i<N; i++)
			length[i] = i+1;
		
		int n = N;
		int t[][] = new int[n+1][N+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<N+1; j++) {
				if(i == 0 || j == 0)
					t[i][j] = 0;
				
				else if(length[i-1] <= j)
					t[i][j] = Math.max(prices[i-1] + t[i][j-length[i-1]], t[i-1][j]);
				else
					t[i][j] = t[i-1][j];
			}
		}
		
		System.out.println(t[n][N]);
	}
}
