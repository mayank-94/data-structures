/**
 * 
 */
package demo.one.to.n.problem;

/**
 * @author Mayank
 *
 */
public class SwapSortApproach {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{2, 3, 1, 5, 1};
		int i = 0;
		while(i < arr.length) {
			if(arr[i] != arr[arr[i] - 1]) {
				swap(i, arr[i] - 1, arr);
			}
			else
				i++;  // element at i is at correct position or duplicate
		}
		
		for(int j=0; j<arr.length; j++)
			if(arr[j] != j+1) {
				System.out.println("Missing element is "+(j+1));
				System.out.println("Duplicate number is "+arr[j]);
			}
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
