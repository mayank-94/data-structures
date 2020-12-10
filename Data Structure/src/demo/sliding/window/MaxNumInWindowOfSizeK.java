/**
 * 
 */
package demo.sliding.window;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Mayank
 *
 */
public class MaxNumInWindowOfSizeK {

	public static void main(String[] args) {
		
		int[] arr = {9, 3, 5, 7, 6, 3, 2, 1, 9};
		int k = 4;
		int n = arr.length;
		Deque<Integer> queue = new ArrayDeque<>();
		for(int i=0; i<k; i++) {
			while(queue.size() > 0 && arr[i] > queue.getLast()) {
				queue.removeLast();
			}
			queue.addLast(arr[i]);
		}
		System.out.print(queue.getFirst()+" ");
		for(int i=k; i<n; i++) {
			
			while(queue.size() > 0 && arr[i] > queue.getLast()) {
				queue.removeLast();
			}
			queue.addLast(arr[i]);
			
			//keeping window size
			if(queue.getFirst() == arr[i-k])
				queue.removeFirst();
			
			System.out.print(queue.getFirst()+" ");
		}
		
	}
	
}
