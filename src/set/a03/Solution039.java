package set.a03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution039 {
	List<List<Integer>> rel = new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		detect(candidates, 0, target, new ArrayList<Integer>());
		return rel;
    }
	
	private void detect (int[] candidates, int index, int target, List<Integer> list){
		if(target == 0){
			List<Integer> copy = new ArrayList<Integer>(list);
			rel.add(copy);
			return;
		}
		
		if(target < 0){
			return;
		}
		
		while(index < candidates.length){
			list.add(candidates[index]);
			detect (candidates, index, target - candidates[index], list);
			list.remove(list.size() - 1);
			index++;
		}
	}
	
}
