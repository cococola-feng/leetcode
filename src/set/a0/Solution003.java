package set.a0;

import java.util.HashMap;

public class Solution003 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0){
			return 0;
		}
		
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int start = 0;
        int max = 1;
        
        map.put(s.charAt(0), 0);
        
        for (int end = 1; end < s.length(); end++){
        	char c = s.charAt(end);
        	if(map.containsKey(c)){
        		int value = map.get(c) + 1;
        		start = start > value ? start : value;
        	}
        	
        	map.put(c, end);
        	
        	max = max > end - start + 1 ? max : end -start + 1;
        }
        
        return max;
    }
}
