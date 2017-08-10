package set.a20;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
		
		return check(s, t) && check(t, s);
    }
	
	private boolean check(String s, String t){
		boolean rel = true;
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++){
        	if(map.containsKey(s.charAt(i))){
        		if(map.get(s.charAt(i)) != t.charAt(i)){
        			rel = false;
        			break;
        		}
        	}else{
        		map.put(s.charAt(i), t.charAt(i));
        	}
        }
        
        return rel;
	}
}
