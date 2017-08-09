package set.a16;

public class Solution168 {
	public String convertToTitle(int n) {
		String rel = "";
        while(n > 0){
        	int mod = (n - 1) % 26;
        	rel = (char) ('A' + mod) + rel;
        	n = (n - mod + 1) / 26;
        }
        return rel;
    }
}
