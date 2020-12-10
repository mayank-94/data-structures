/**
 * 
 */
package demo.sliding.window;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Mayank
 *
 */
public class LongestSubstringNonRepeatingChar {

	public static void main(String[] args) {
		
		String s = "dvdf";
		char[] arr = s.toCharArray();
        int n = arr.length;
        if(n == 0)
        	return;
        
        int max = 0;
        int i=0, j=0;
        Set<Character> set = new HashSet<>();
        while(j < n) {
        	if(!set.contains(arr[j])) {
        		set.add(arr[j]);
        		max = Math.max(max, set.size());
        		j++;
        	}
        	else {
        		set.remove(arr[i]);
        		i++;
        	}
        }
        System.out.println(max);
	}
}
