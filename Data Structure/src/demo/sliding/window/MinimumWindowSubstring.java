/**
 * 
 */
package demo.sliding.window;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mayank
 *
 */
public class MinimumWindowSubstring {

	public static void main(String[] args) {
		
		String t = "toc";  //ABC
		String s = "timetopractice"; //ADOBECODEBANC
		String res = "";
		
		Map<Character, Integer> window = new HashMap<>();
		for(int i=0; i<t.length(); i++) {
			char c = t.charAt(i);
			window.put(c, window.getOrDefault(c, 0) + 1);
		}
		
		int required = window.size();
		int[] arr = {-1, 0, 0};
		int left = 0, right = 0, expected = 0;
		Map<Character, Integer> minWindow = new HashMap<>();
		
		while(right < s.length()) {
			char c = s.charAt(right);
			minWindow.put(c, minWindow.getOrDefault(c, 0) + 1);
			if(window.containsKey(c) && minWindow.get(c).intValue() == window.get(c).intValue()) {
				expected++;
			}
			
			while(left <= right && expected == required) {
				if(arr[0] == -1 || arr[0] > right-left+1) {
					arr[0] = right-left+1;
					arr[1] = left;
					arr[2] = right;
				}
				c = s.charAt(left);
								
				if(window.containsKey(c) && minWindow.get(c).intValue() == window.get(c).intValue())
					expected--;
				
				minWindow.put(c, minWindow.get(c) - 1);
				left++;
			}
			right++;
		}
		
		res = s.substring(arr[1], arr[2]+1);
		System.out.println(res);
		    
	}
}
