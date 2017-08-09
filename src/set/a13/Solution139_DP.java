package set.a13;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139_DP {
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordSet = new HashSet<String>(wordDict);
		int maxLen = 0;
		for(String word : wordSet) maxLen = Math.max(word.length(), maxLen);
		boolean[] split = new boolean[s.length()];
		
		for(int i = 0; i < s.length(); i++){
			int startIndex = Math.max(i - maxLen + 1, 0);
			while(startIndex < i + 1){
				if(startIndex > 0 && split[startIndex - 1] == false) {startIndex++; continue;}
				String word = s.substring(startIndex, i + 1);
				if(wordDict.contains(word)){
					split[i] = true;
					break;
				}
				startIndex++;
			}
		}
		
		return split[split.length - 1];
    }
}
