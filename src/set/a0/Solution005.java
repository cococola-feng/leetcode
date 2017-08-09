package set.a0;

public class Solution005 {
	private int low, maxLength;
	
	public String longestPalindrome(String s) {
		if(s.length() < 2){
			return s;
		}
		
        for(int i = 0; i < s.length() - 1; i++){
        	extendPalindrome(s, i, i);
        	extendPalindrome(s, i, i + 1);
        }
        
        return s.substring(low, low + maxLength);
    }
	
	private void extendPalindrome(String s, int start, int end){
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
			start--;
			end++;
		}
		if(maxLength < end - start - 1){
			low = start + 1;
			maxLength = end - start - 1;
		}
	}
}
