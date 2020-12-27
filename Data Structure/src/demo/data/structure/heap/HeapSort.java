/**
 * 
 */
package demo.data.structure.heap;

/**
 * @author Mayank
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		
		int arr[] = {15, 20, 7, 9, 30, 19, 23, 11};
		int n = arr.length;
		buildHeap(arr, n);
		for(int x : arr)
			System.out.print(x+" ");
	}

	private static void buildHeap(int[] arr, int n) {
		
		for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
            
		 for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
	     }
	}

	private static void heapify(int[] arr, int n, int i) {
		
		int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        
        if(l<n && arr[l] > arr[largest])
            largest = l;
        if(r<n && arr[r] > arr[largest])
            largest = r;
        
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapify(arr, n, largest);
        }    
	}
}
