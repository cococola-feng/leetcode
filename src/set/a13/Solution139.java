package set.a13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordSet = new HashSet<String>(wordDict);
		int maxLen = 0;
		for(String word : wordSet) maxLen = Math.max(word.length(), maxLen);
		return recursiveBreak(s, 0, wordSet, maxLen);
    }
	
	private boolean recursiveBreak(String s, int index, Set<String> wordSet, int maxLen){
		if(index == s.length()) return true;
		boolean res = false;
		int wordLen = Math.min(s.length() - index, maxLen);
		
		while(wordLen > 0){
			String word = s.substring(index, index + wordLen);
			if(wordSet.contains(word)){
				res = recursiveBreak(s, index + wordLen, wordSet, maxLen);
			}
			if(res) break;
			wordLen--;
		}
		
		return res;
		
	}
}
