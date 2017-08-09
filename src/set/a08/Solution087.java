package set.a08;

public class Solution087 {
	public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)){
        	return true;
        }
        
        if(s1.length() != s2.length()){
        	return false;
        }
        
        int[] count = new int[26];
        for(char c : s1.toCharArray()){
        	count[c - 'a']++;
        }
        for(char c : s2.toCharArray()){
        	count[c - 'a']--;
        }
        for(int i : count){
        	if(i != 0){
        		return false;
        	}
        }
        
        for(int i = 1; i < s1.length(); i++){
        	if( isScramble(s1.substring(0, i), s2.substring(0, i))
        			&& isScramble(s1.substring(i), s2.substring(i))
        		|| isScramble(s1.substring(0, i), s2.substring(s2.length() - i))
    				&& isScramble(s1.substring(i), s2.substring(0, s2.length() - i))){
        		return true;
        	}
        }
        
        return false;
    }
}
