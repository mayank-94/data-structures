/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class SearchInRowColumnSortedArray {

	public static void main(String[] args) {
		
		int arr[][] = {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 47},
				{32, 33, 39, 50}
		};
		int n = arr.length;
		int m = arr[0].length;
		
		int ele = 29;
		int i=0, j=m-1;
		while(i >= 0 && i < n && j >= 0 && j < m) {
			if(arr[i][j] == ele) {
				break;
			}
			
			if(arr[i][j] > ele)
				j = j - 1;
			else if(arr[i][j] < ele)
				i = i + 1;			
		}
		
		System.out.println(i+" "+j);
	}
}
