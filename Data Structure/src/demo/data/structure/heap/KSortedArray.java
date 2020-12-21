package demo.data.structure.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {6, 5, 3, 2, 8, 10, 9};
		int k = 3;
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		List<Integer> sortedHeap = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			heap.add(arr[i]);
			if(heap.size() > k) {
				sortedHeap.add(heap.poll());
			}
		}
		
		while(heap.size() > 0)
			sortedHeap.add(heap.poll());
		
		System.out.println(sortedHeap);
	}
}
