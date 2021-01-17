/**
 * 
 */
package demo.data.structure.sorting;

/**
 * @author Mayank
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {7, 2, 1, 6, 8, 5, 3, 4};
		int len = arr.length - 1;
		quickSort(arr, 0, len);
		
		for(int x : arr)
			System.out.print(x+" ");
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int pivotIndex = partition(arr, start, end);
			quickSort(arr, start, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pi = start;
		int i=start;
		while(i < end) {
			if(arr[i] <= pivot) {
				swap(i, pi, arr);
				pi++;
			}
			i++;
		}
		
		swap(pi, end, arr);
		return pi;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
