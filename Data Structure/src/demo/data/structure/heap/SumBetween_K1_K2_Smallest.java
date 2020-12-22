/**
 * 
 */
package demo.data.structure.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Mayank
 *
 */
public class SumBetween_K1_K2_Smallest {

	public static void main(String[] args) {
		
		int arr[] = {3, 6, 5, 8, 15, 11, 7, 9};
		int k1 = 3;
		int k2 = 6;
		
		int k1Smallest = findKthSmallest(arr, k1);
		int k2Smallest = findKthSmallest(arr, k2);
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i] > k1Smallest && arr[i] < k2Smallest)
				sum = sum + arr[i];
		
		System.out.println(sum);
	}

	private static int findKthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<k; i++)
			maxHeap.add(arr[i]);
		
		for(int i=k; i<arr.length; i++) {
			if(arr[i] < maxHeap.peek()) {
				maxHeap.add(arr[i]);
				maxHeap.poll();
			}
		}
		return maxHeap.poll();
	}
}
