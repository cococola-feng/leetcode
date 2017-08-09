package set.a17;

public class Solution171 {
	public int titleToNumber(String s) {
        int rel = 0;
        int weight = 1;
        
        for(int i = s.length() - 1; i >= 0; i--){
        	int temp = (s.charAt(i) - 'A') + 1;
        	rel += (temp * weight);
        	weight *= 26;
        }
        
        return rel;
    }
}
