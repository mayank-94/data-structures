/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String s = "babad";
		StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();
        
        int m = s.length();
        int n = s2.length();
        int t[][] = new int[m+1][n+1];
        int max = 0;
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
                
                else if(s.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    max = Math.max(max, t[i][j]);
                }
                
                else
                    t[i][j] = 0;
            }
        }
        
        System.out.println(max);
        
//        max = 0;
//        for(int i=0; i<m+1; i++) {
//        	for(int j=0; j<n+1; j++) {
//        		if(t[i][j] != 0 && (j-i+1) > max) {
//        			max = j-i+1;
//        			System.out.println(max);
//        			System.out.println(s.substring(i, j-i+1));
//        		}
//        	}
//        }
	}
}
