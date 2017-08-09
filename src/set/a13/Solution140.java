package set.a13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution140 {
	public List<String> wordBreak(String s, List<String> wordDict) {
		Set<String> wordSet = new HashSet<String>(wordDict);
		int maxLen = 0;
		for(String word : wordSet) maxLen = Math.max(word.length(), maxLen);
		List<String> res = new ArrayList<String>();
		recursiveBreak(s, 0, wordSet, maxLen, "", res);
		return res;
    }
	
	private void recursiveBreak(String s, int index, Set<String> wordSet, int maxLen, String breakStr, List<String> res){
		if(index == s.length()) {res.add(breakStr.substring(0,breakStr.length() - 1)); return;}
		int wordLen = Math.min(s.length() - index, maxLen);
		
		while(wordLen > 0){
			String word = s.substring(index, index + wordLen);
			if(wordSet.contains(word)){
				recursiveBreak(s, index + wordLen, wordSet, maxLen, breakStr + word + " ", res);
			}
			wordLen--;
		}
		
	}
}
