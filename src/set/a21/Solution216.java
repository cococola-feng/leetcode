package set.a21;

import java.util.ArrayList;
import java.util.List;

public class Solution216 {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        combine(k, n, 1, new ArrayList<Integer>(), rel);
        return  rel;
    }
	
	private void combine(int k, int n, int index, List<Integer> list, List<List<Integer>> rel){
		if(k == 0 || n == 0){
			if(k ==0 && n ==0 && list != null && list.size() > 0){
				rel.add(new ArrayList<Integer>(list));
			}
			return;
		}
		while(index < 10){
			list.add(index);
			combine(k - 1, n - index, index + 1, list, rel);
			list.remove(list.size() - 1);
			index++;
		}
	}
}
