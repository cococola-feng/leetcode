package set.a07;

import java.util.ArrayList;
import java.util.List;

public class Solution078 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length == 0){
			return rel;
		}
		
		recuresiveSubsets(nums, 0, new ArrayList<Integer>(), rel);
		
		return rel;
    }
	
	private void recuresiveSubsets(int[] nums, int startIndex, List<Integer> subset, List<List<Integer>> rel){
		rel.add(new ArrayList<Integer>(subset));
		while(startIndex < nums.length){
			subset.add(nums[startIndex]);
			recuresiveSubsets(nums, startIndex + 1, subset, rel);
			subset.remove(subset.size() - 1);
			startIndex++;
		}
	}
}
