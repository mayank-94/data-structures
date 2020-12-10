package demo.sliding.window;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CountAnagrams {

	public static void main(String[] args) {
		
		String s = "abab", p = "ab";
		List<Integer> anagrams = new ArrayList<>();
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int len = p.length();
        for(int i=0; i<len; i++)
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        
        for(int i=0; i<len; i++)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        
        if(pMap.equals(sMap))
            anagrams.add(0);
        
        for(int i=len; i<s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            
            if(sMap.get(s.charAt(i-len)) == 1)
                sMap.remove(s.charAt(i-len));
            else
                sMap.put(s.charAt(i-len), sMap.get(s.charAt(i-len)) - 1);
            
            if(pMap.equals(sMap))
                anagrams.add(i-len+1);
        }
        
        System.out.println(anagrams);
	        
	}
}
