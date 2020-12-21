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
class Pair{
	private int key;
	private int value;
	
	public Pair() {}
	
	public Pair(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
}

public class KNearestNumbers {

	public static void main(String[] args) {
		
		int arr[] = {10, 2, 14, 4, 7, 16};
		int k = 3;
		int x = 5;
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o2.getValue() - o1.getValue();
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int value = Math.abs(x - arr[i]);
			Pair pair = new Pair(key, value);
			maxHeap.add(pair);
			
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		
		while(maxHeap.size() > 0)
			System.out.print(maxHeap.poll().getKey()+" ");
	}
}
