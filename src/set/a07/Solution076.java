package set.a07;

import java.util.HashMap;
import java.util.Map;

public class Solution076 {
	public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : t.toCharArray()){
        	if(!map.containsKey(c)){
        		map.put(c, 0);
        	}
        	map.put(c, map.get(c) + 1);
        }
        
        int counter = t.length();
        int begin = 0, end = 0;
        int dis = Integer.MAX_VALUE;
        int head = 0;
        
        while(end < s.length()){
			if (map.containsKey(s.charAt(end))) {
	        	if(map.get(s.charAt(end)) > 0){
	        		counter--;
	        	}
        		map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
        	}
        	end++;
        	
        	while(counter == 0){
        		if(end - begin < dis){
        			dis = end - begin;
        			head = begin;
        		}
        		
        		if(map.containsKey(s.charAt(begin))){
	        		if(map.get(s.charAt(begin)) == 0){
	        			counter++;
	        		}
	        		map.put(s.charAt(begin), map.get(s.charAt(begin)) + 1);
        		}
        		begin++;
        	}
        }
        
        return dis == Integer.MAX_VALUE ? "" : s.substring(head, head + dis);
    }
}
