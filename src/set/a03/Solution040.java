package set.a03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution040 {
	private List<List<Integer>> rel = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
        combine(candidates, 0, target, new ArrayList<Integer>());
        return rel;
    }
	
	private void combine (int[] candidates, int index, int target, List<Integer> list){
		if(target < 0){
			return;
		}
		
		if(target == 0){
			rel.add(new ArrayList<Integer>(list));
			return;
		}
		
		if(index >= candidates.length){
			return;
		}
		
		list.add(candidates[index]);
		combine (candidates, index+1, target - candidates[index], list);
		list.remove(list.size() - 1);
		
		while(++index < candidates.length && candidates[index] == candidates[index - 1]);
		combine (candidates, index, target, list);
	}
}

