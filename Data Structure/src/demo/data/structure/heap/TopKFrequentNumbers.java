/**
 * 
 */
package demo.data.structure.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * @author Mayank
 *
 */

class FreqPair{
	private int key;
	private int value;
	
	public FreqPair(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "FreqPair [key=" + key + ", value=" + value + "]";
	}
}

public class TopKFrequentNumbers {

	public static void main(String[] args) {
		
		int arr[] = {1, 1, 1, 3, 2, 2, 4, 5};
		int k = 2;
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i=0; i<arr.length; i++)
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		
		PriorityQueue<FreqPair> minHeap = new PriorityQueue<>(new Comparator<FreqPair>() {
			@Override
			public int compare(FreqPair o1, FreqPair o2) {
				return o1.getValue() - o2.getValue();
			}
		});
		for(Entry<Integer, Integer> entry : freq.entrySet()) {
			minHeap.add(new FreqPair(entry.getKey(), entry.getValue()));
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
//		while(minHeap.size() > 0)
//			System.out.println(minHeap.poll());
		
		while(minHeap.size() > 0)
			System.out.print(minHeap.poll().getKey()+" ");
	}
}
