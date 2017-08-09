package set.a04;

public class Solution044 {
	public boolean isMatch(String s, String p) {
//        return match(s, p, 0, 0);
		boolean[][] map = new boolean[s.length() + 1][p.length() + 1];
		map[0][0] = true;
		for(int i = 0; i < p.length(); i++){
			if(p.charAt(i) == '*'){
				map[0][i + 1] = true;
			}else{
				break;
			}
		}
		
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < p.length(); j++){
				if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
					map[i + 1][j + 1] = map[i][j];
				}else if(p.charAt(j) == '*'){
					map[i + 1][j + 1] = map[i][j] | map[i+1][j] | map[i][j+1];
				}else{
					map[i+1][j+1] = false;
				}
			}
		}
		
		return map[s.length()][p.length()];
    }
	
	private boolean match(String s, String p, int i, int j) {
		if (i >= s.length()) {
			while (j < p.length() && p.charAt(j) == '*'){
				j++;
			}
			return j >= p.length();
		}
		
		if(j >= p.length()) {
			return false;
		}
		
		if (s.charAt(i) == p.charAt(j)) {
			return match(s, p, i + 1, j + 1);
		}else if(p.charAt(j) == '?'){
			return match(s, p, i + 1, j + 1);
		}else if(p.charAt(j) == '*'){
			if(match(s, p, i, j + 1)){
				return true;
			}else if(match(s, p, i + 1, j + 1)){
				return true;
			}else{
				return match(s, p, i + 1, j);
			}
		}
		
		return false;
	}
}
