package set.a02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution030 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> rel = new ArrayList<Integer>();
		
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return rel;
		}
		
		Map<String, Integer> dict = new HashMap<String, Integer>();
		for(String word : words){
			if(dict.containsKey(word)){
				dict.put(word, dict.get(word) + 1);
			}else{
				dict.put(word, 1);
			}
		}
		
		int wordLen = words[0].length();
		int wordCount = words.length;
		
		for(int i = 0; i <= s.length() - wordLen * wordCount; i++){
			Map<String, Integer> copy = new HashMap<String, Integer>(dict);
			for(int j = 0; j < wordCount; j++){
				String str = s.substring(i + j * wordLen, i + j * wordLen + wordLen);
				if(copy.containsKey(str)){
					int value = copy.get(str);
					if (value > 1){
						copy.put(str, value - 1);
					}else{
						copy.remove(str);
					}
				}else{
					break;
				}
			}
			if(copy.isEmpty()){
				rel.add(i);
			}
		}
		
		return rel;
	}
	/*public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> rel = new ArrayList<Integer>();
        
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
        	return rel;
        }
        
        int wordLen = words[0].length();
        int wordCount = words.length;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : words){
        	if (map.containsKey(word)) {
        		map.put(word, map.get(word) + 1);
        	}else{
        		map.put(word, 1);
        	}
        }
        
        for(int i = 0; i <= s.length() - wordLen * wordCount; i++){
        	Map<String, Integer> copy = new HashMap<String, Integer>(map);
        	for(int j = 0; j < wordCount; j++){
        		String str = s.substring(i + j * wordLen, i + j * wordLen + wordLen);
        		if(copy.containsKey(str)){
        			int count = copy.get(str);
        			if(count == 1){
        				copy.remove(str);
        			}else{
        				copy.put(str, count - 1);
        			}
        		}else{
        			break;
        		}
        	}
        	if(copy.isEmpty()){
        		rel.add(i);
        	}
        }
        return rel;
    }*/
}
