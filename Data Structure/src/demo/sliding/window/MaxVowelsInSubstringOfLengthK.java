/**
 * 
 */
package demo.sliding.window;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Mayank
 *
 */
public class MaxVowelsInSubstringOfLengthK {
	public static void main(String[] args) {
		
		String s = "rhythms";
		int k = 3;
		List<Character> vowels = new ArrayList<>();
		List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
		int max = 0;
		for(int i=0; i<k; i++) {
			if(list.contains(s.charAt(i))) {
				vowels.add(s.charAt(i));
			}
			max = Math.max(max, vowels.size());
		}
		
		for(int i=k; i<s.length(); i++) {
			if(list.contains(s.charAt(i))) {
				vowels.add(s.charAt(i));
			}
			if(!vowels.isEmpty()) {
				if(vowels.get(0) == s.charAt(i-k))
					vowels.remove(0);
			}
			max = Math.max(max, vowels.size());
		}
		
		System.out.println(max);
		
	}
}
