/**
 * 
 */
package demo.data.structure.hashing;

import java.util.TreeMap;
import java.util.Map;

/**
 * @author Mayank
 *
 */
public class CharacterCountInAscending {
	
	public static void main(String[] args) {
		
		String str = "mayank";
		Map<Character, Integer> hash_map = new TreeMap<Character, Integer>();
		char arr[] = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(hash_map.containsKey(arr[i]))
				hash_map.put(arr[i], hash_map.get(arr[i]) + 1);
			
			else
				hash_map.put(arr[i], 1);
		}
		
		System.out.println(hash_map);
	}

}
