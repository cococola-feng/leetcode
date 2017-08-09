package set.a13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution140_DP {
	public List<String> wordBreak(String s, List<String> wordDict) {
		if(!canBreak(s, wordDict)) return new ArrayList<String>();
		
		Set<String> wordSet = new HashSet<String>(wordDict);
		int maxLen = 0;
		for(String word : wordSet) maxLen = Math.max(word.length(), maxLen);
		boolean[] split = new boolean[s.length()];
		Map<Integer, List<String>> subString = new HashMap<Integer, List<String>>();
		for(int i = 0; i < s.length(); i++){
			int startIndex = Math.max(i - maxLen + 1, 0);
			while(startIndex < i + 1){
				//TODO delete 1
				System.out.println(i + "\t" + startIndex);
				
				if(startIndex > 0 && split[startIndex - 1] == false) {startIndex++; continue;}
				String word = s.substring(startIndex, i + 1);
				if(wordDict.contains(word)){
					split[i] = true;
					List<String> newSubString = subString.containsKey(i) ? subString.get(i) : new ArrayList<String>();
					if(startIndex == 0){
						newSubString.add(word);
					}else{
						for(String preStr : subString.get(startIndex - 1)){
							newSubString.add(preStr + " " + word);
							//TODO delete 1
							System.out.println(preStr + " " + word);
						}
					}
					subString.put(i, newSubString);
				}
				startIndex++;
			}
		}
			
		return subString.containsKey(s.length() - 1) ? subString.get(s.length() - 1) : new ArrayList<String>();
    }
	
	private boolean canBreak(String s, List<String> wordDict) {
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
