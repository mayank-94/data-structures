/**
 * 
 */
package demo.data.structure.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mayank
 *
 */
public class IntegerCount {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 5, 1, 9, 2, 7, 1, 5, 8};
		Map<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(hash_map.containsKey(arr[i]))
				hash_map.put(arr[i], hash_map.get(arr[i]) + 1);
			
			else
				hash_map.put(arr[i], 1);
		}
		
		System.out.println(hash_map);
	}
}
