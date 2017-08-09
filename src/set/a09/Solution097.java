package set.a09;

public class Solution097 {
	public boolean isInterleave(String s1, String s2, String s3) {
        return recursiveCompare(s1, 0, s2, 0, s3, 0);
    }
	
	private boolean recursiveCompare(String s1, int a, String s2, int b, String s3, int c){
		if(c == s3.length()){
			return a == s1.length() && b == s2.length();
		}
		
		boolean rel = false;
		if(a < s1.length() && s3.charAt(c) == s1.charAt(a)){
			rel = recursiveCompare(s1, a + 1, s2, b, s3, c + 1);
		}
		
		if(rel){
			return true;
		}
		
		if(b < s2.length() && s3.charAt(c) == s2.charAt(b)){
			rel = recursiveCompare(s1, a, s2, b + 1, s3, c + 1);
		}
		
		return rel;
	}
}
