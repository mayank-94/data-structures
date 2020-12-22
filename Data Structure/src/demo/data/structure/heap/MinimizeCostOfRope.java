/**
 * 
 */
package demo.data.structure.heap;

import java.util.PriorityQueue;

/**
 * @author Mayank
 *
 */
public class MinimizeCostOfRope {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for(int i=0; i<arr.length; i++)
			heap.add(arr[i]);
		
		int cost = 0;
		while(!(heap.size() == 1)) {
			int ct = 0;
			int sum = 0;
			while(ct < 2) {
				sum = sum + heap.poll();
				ct++;
			}
			heap.add(sum);
			cost = cost + sum;
		}
		System.out.println(cost);
	}
}
