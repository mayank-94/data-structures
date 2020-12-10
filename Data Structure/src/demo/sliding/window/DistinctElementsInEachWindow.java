/**
 * 
 */
package demo.sliding.window;

import java.util.Map;
import java.util.HashMap;
/**
 * @author Mayank
 *
 */
public class DistinctElementsInEachWindow {

	public static void main(String[] args) {
		
		int A[] = {1,2,1,3,4,2,3};
		int k = 4;
		int n = A.length;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i<k; i++) 
			hashMap.put(A[i], hashMap.getOrDefault(A[i], 0) + 1);
		System.out.print(hashMap.size()+" ");
		
		for(int i=k; i<n; i++) {
			hashMap.put(A[i], hashMap.getOrDefault(A[i], 0) + 1);
			
			if(hashMap.get(A[i-k]) == 1)
				hashMap.remove(A[i-k]);
			
			else
				hashMap.put(A[i-k], hashMap.get(A[i-k]) - 1);
			
			System.out.print(hashMap.size()+" ");
		}
	}
}
