package set.a05;

import java.util.ArrayList;
import java.util.List;

public class Solution060 {
	public String getPermutation(int n, int k) {
		StringBuffer rel = new StringBuffer();
		
        int[] factor = new int[n];
        factor[0] = 1;
        for(int i = 1; i < n; i++){
        	factor[i] = i * factor[i - 1];
        }
        
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
        	list.add(i);
        }
        
        k--;
        int factorIndex = n;
        while(--factorIndex >= 0){
        	int listIndex = k / factor[factorIndex];
        	rel.append(list.get(listIndex));
        	list.remove(listIndex);
        	k %= factor[factorIndex];
        }
        
        return rel.toString();
    }
}
