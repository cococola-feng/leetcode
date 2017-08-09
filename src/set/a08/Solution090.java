package set.a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution090 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        recursiveSubset(nums, 0, new ArrayList<Integer>(), rel);
        
        return rel;
    }
	
	private void recursiveSubset (int[] nums, int start, List<Integer> list, List<List<Integer>> rel){
		if(start == nums.length){
			rel.add(new ArrayList<Integer>(list));
			return;
		}
		// First Way
		list.add(nums[start]);
		recursiveSubset(nums, start + 1, list, rel);
		list.remove(list.size() - 1);
		// Second Way
		while(++start < nums.length && nums[start] == nums[start-1]);
		recursiveSubset(nums, start, list, rel);
	}
}
