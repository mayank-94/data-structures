package demo.data.structure.arrays;

public class Sort_0_1_2 {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 0, 0, 2, 0, 1, 2, 0, 2};
		int low = 0;
		int pivot = 1;
		int high = arr.length - 1;
		int mid = 0;
		
		while(mid <= high) {
			
			if(arr[mid] < pivot) { // 0
				swap(arr, low, mid);
				low++;
				mid++;
			}
			else if(arr[mid] > pivot) {
				swap(arr, mid, high);
				
			}
		}
	}

	private static void swap(int []arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
