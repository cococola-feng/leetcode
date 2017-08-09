package set.a09;

public class Solution097DP {
	public boolean isInterleave(String s1, String s2, String s3) {
		if(s1.length() + s2.length() != s3.length()) return false;
		
		boolean[][] map = new boolean[s1.length() + 1][s2.length() + 1];
		for(int i = 0; i <= s1.length(); i++){
			for(int j = 0; j <= s2.length(); j++){
				if(i == 0 && j == 0){
					map[i][j] = true;
				}else if(i == 0){
					map[i][j] = map[i][j-1] && s2.charAt(j-1) == s3.charAt(i + j - 1);
				}else if(j == 0){
					map[i][j] = map[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1 + j);
				}else{
					map[i][j] = map[i][j-1] && s2.charAt(j-1) == s3.charAt(i + j - 1) || map[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i - 1 + j);
				}
			}
		}
		
		return map[s1.length()][s2.length()];
    }
}
