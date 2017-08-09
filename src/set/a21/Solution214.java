package set.a21;

public class Solution214 {
	public String shortestPalindrome(String s) {
        int index = s.length() - 1;
        while(index > 0 && !isPalindrome(s, 0, index)) index--;
        
        String append = s.substring(index + 1, s.length());
        String revAppend = new StringBuffer(append).reverse().toString();
        
        return revAppend + s;
    }
	
	private boolean isPalindrome(String s, int start, int end){
		boolean rel = true;
		while(start < end){
			if(s.charAt(start) != s.charAt(end)){
				rel = false;
				break;
			}
			start++;
			end--;
		}
		return rel;
	}
}
