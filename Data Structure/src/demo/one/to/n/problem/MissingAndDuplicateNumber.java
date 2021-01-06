/**
 * 
 */
package demo.one.to.n.problem;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Mayank
 *
 */
public class MissingAndDuplicateNumber {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1, 4, 3, 4, 5};
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int x : arr)
			map.put(x, map.getOrDefault(x, 0) + 1);
		
		for(int i=1; i<=n; i++) {
			if(map.containsKey(i)) {
				if(map.get(i) > 1)
					System.out.println(i +" is repeated");
			}
			else {
				System.out.println(i +" is missing");
			}
		}
	}
}
