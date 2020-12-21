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
public class KthSmallest {

	public static void main(String[] args) {
		
		int arr[] = {8, 6, 2, 4, 5, 10, 9, 7};
		int k = 5;
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<k; i++)
			maxheap.add(arr[i]);
		
		for(int i=k; i<arr.length; i++) {
			if(arr[i] < maxheap.peek()) {
				maxheap.poll();
				maxheap.add(arr[i]);
			}
		}
		
		System.out.println(maxheap.peek());
	}
}
