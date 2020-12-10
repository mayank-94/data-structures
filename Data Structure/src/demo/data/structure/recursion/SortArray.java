/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */

class BubbleSort{
	
	void sort(int arr[], int n) {
		if(n == 1)
			return;
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		sort(arr, n-1);
	}
	
}

public class SortArray {

	public static void main(String[] args) {
		
		BubbleSort sort = new BubbleSort();
		int arr[] = {5, 3, 1, 9, 6, 4};
		int len = arr.length;
		sort.sort(arr, len);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}
}
