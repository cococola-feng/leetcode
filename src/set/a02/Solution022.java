package set.a02;

import java.util.ArrayList;
import java.util.List;

public class Solution022 {
	private List<String> rel = new ArrayList<String>();
	
	public List<String> generateParenthesis(int n) {
        generate("", n, 0, 0);
        return rel;
    }
	
	private void generate (String str, int n, int left, int right){
		if(str.length() == 2 * n){
			rel.add(str);
		}
		
		if(left < n){
			generate(str+"(", n, left + 1, right);
		}
		
		if(right < left){
			generate(str+")", n, left, right + 1);
		}
	}
}
