/**
 * 
 */
package demo.data.structure.heap;

import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
/**
 * @author Mayank
 *
 */
public class RearrangeStringWithNoSameAdjacent {

	public static void main(String[] args) {
		
		String s = "aabbca";
		Map<Character, Integer> freq = new HashMap<>();
		for(char c : s.toCharArray())
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		
		PriorityQueue<Character> maxHeap = new 
				PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
		maxHeap.addAll(freq.keySet());
		
		StringBuilder result = new StringBuilder();
		while(maxHeap.size() > 1) {
			char current = maxHeap.poll();
			char next = maxHeap.poll();
			result.append(current);
			result.append(next);
			freq.put(current, freq.get(current) - 1);
			freq.put(next, freq.get(next) - 1);
			
			if(freq.get(current) > 0)
				maxHeap.add(current);
			if(freq.get(next) > 0)
				maxHeap.add(next);
		}
		
		if(!maxHeap.isEmpty()) {
			char last = maxHeap.poll();
			if(freq.get(last) > 1) {
				System.out.println("Can't be rearranged");
				return;
			}
			
			else
				result.append(last);
		}
		
		System.out.println(result.toString());
	}
}
