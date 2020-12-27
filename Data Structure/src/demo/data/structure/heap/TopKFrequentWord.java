/**
 * 
 */
package demo.data.structure.heap;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashMap;
/**
 * @author Mayank
 *
 */
public class TopKFrequentWord {

	public static void main(String[] args) {
		
		String words[] = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		int k = 4;
		Map<String, Integer> freq = new HashMap<>();
        for(String s : words)
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        
        PriorityQueue<String> minHeap = 
                new PriorityQueue<>(new Comparator<String>() {

					@Override
					public int compare(String s1, String s2) {
						if(freq.get(s1) == freq.get(s2))
							return s1.compareTo(s2);
						else
							return freq.get(s2) - freq.get(s1);
					}
				});
        
        for(String s : freq.keySet()) {
        	minHeap.add(s);
        }
        
        int ct=0;
        while(k > ct) {
        	System.out.println(minHeap.poll());
        	ct++;
        }
	}
}
