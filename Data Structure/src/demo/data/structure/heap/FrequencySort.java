/**
 * 
 */
package demo.data.structure.heap;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Mayank
 *
 */
class SortPair{
	private int key;
	private int value;
	
	public SortPair(int key, int value) {
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
		return "SortPair [key=" + key + ", value=" + value + "]";
	}
}

public class FrequencySort {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 1, 5, 2, 3, 1, 4, 4, 4};
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int i=0; i<arr.length; i++) 
			freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
		
		PriorityQueue<SortPair> heap = new PriorityQueue<>(new Comparator<SortPair>() {
			@Override
			public int compare(SortPair p1, SortPair p2) {
				if(p2.getValue() == p1.getValue())
					return p1.getKey() - p2.getKey();
				else
					return p2.getValue() - p1.getValue();
			}
		});
		
		for(Entry<Integer, Integer> entry : freqMap.entrySet()) {
			heap.add(new SortPair(entry.getKey(), entry.getValue()));
		}
		
		while(heap.size() > 0)
			System.out.print(heap.poll().getKey()+" ");
		
	}
}
