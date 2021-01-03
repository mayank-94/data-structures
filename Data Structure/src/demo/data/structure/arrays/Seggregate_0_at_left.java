package demo.data.structure.arrays;

public class Seggregate_0_at_left {

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 5, 0, 3, 0, 4, 9, 0};
		seggregate(arr);
		for(int x : arr)
			System.out.print(x+" ");
	}

	private static void seggregate(int[] arr) {
		int i = 0, j = 0;
		while(j < arr.length) {
			if(arr[j] != 0)
				j++;
			else {
				swap(i, j, arr);
				i++;
				j++;
			}
		}
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
